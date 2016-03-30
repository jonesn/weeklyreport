(ns weeklyreport.core
  (require [clojure.tools.cli :refer [parse-opts]]
           [clojure.string :as string]
           [endophile.core :as mdown]
           [com.rpl.specter :as spec]
           [clojure.walk :as walk]
           [clj-pdf.core :as pdf])
  (:gen-class))

;; ==============
;; Markdown Logic
;; ==============

(defn weekly-heading-match
  "Helper function to find all weekly headings."
  [markdown-input-element]
  (= :h2 (:tag markdown-input-element)))

(defn monthly-heading-match
  "Helper function to find all monthly headings."
  [markdown-input-element]
  (= :h1 (:tag markdown-input-element)))

(defn tail-of-markdown-from-element
  "Returns the tail block of the document starting from the element passed in matching-element."
  [markdown-seq matching-element]
  (loop [seq-to-parse markdown-seq]
    (let [head (first seq-to-parse)]
      (cond (empty? head) seq-to-parse
            (= head matching-element) (cons head (rest seq-to-parse))
            :else (recur (rest seq-to-parse))))))

(defn path->markdownclj
  "Takes the given file path pointing to a markdown file and loads
   that file into a clojure datastructure."
  [string-file-path]
  (doall
    (mdown/to-clj
      (mdown/mp
        (slurp string-file-path)))))

(defn extract-last-data-block-from-markdown
  [file-path report-type]
  (let [filter-func (cond (= report-type "WEEKLY") weekly-heading-match
                          (= report-type "MONTHLY") monthly-heading-match)
        clj-markdown (path->markdownclj file-path)]
    (->>
      (spec/select [spec/ALL filter-func] clj-markdown)
      (last)
      (tail-of-markdown-from-element clj-markdown))))

;; ==========
;; PDF Logic
;; ==========

(def heading-color [98 190 255])

(def pdf-metadata
  {:title  "Hello Doc"
   :author "Nick Jones"})

(def heading-one-style
  {:style
   {:align  :center
    :size   18
    :color  heading-color
    :family :helvetica}})

(def heading-two-style
  {:style
   {:size   16
    :color  heading-color
    :family :helvetica}})

(def heading-three-style
  {:style
   {:size   14
    :color  heading-color
    :family :helvetica}})

;; Please note for some reason a paragraph style is different to a header style.
;; It isn't an embedded map as it is for a header.
(def paragraph-style
  {:size 10 :family :helvetica})

(defn common-content-extraction
  "Helper to extract common string elements from the markdown."
  [element-map pdf-element-keyword style-map]
  (when-let [content (:content element-map)]
    (vector
      pdf-element-keyword
      style-map
      (string/join content))))

(defn construct-list-for-pdf
  [root-list-element]
  (when-let [seq-of-li-elements (:content root-list-element)]
    (vec
      (into [:list {:indent 10}]
            (vec
              (map
                #(apply str (:content %))
                seq-of-li-elements))))))

(defmulti construct-pdf-from-clj
          "Multimethod to help convert clojure data structures to PDF."
          (fn [element-map] (:tag element-map)))

(defmethod construct-pdf-from-clj :h1
  [element-map]
  (common-content-extraction element-map :heading heading-one-style))

(defmethod construct-pdf-from-clj :h2
  [element-map]
  (common-content-extraction element-map :heading heading-two-style))

(defmethod construct-pdf-from-clj :h3
  [element-map]
  (common-content-extraction element-map :heading heading-three-style))

(defmethod construct-pdf-from-clj :p
  [element-map]
  (common-content-extraction element-map :paragraph paragraph-style))

(defmethod construct-pdf-from-clj :ul
  [element-map]
  (construct-list-for-pdf element-map))

(defmethod construct-pdf-from-clj :default
  [element-map]
  (println "Default fall back called."))

(defn markdownclj->pdfclj
  [markdownclj]
  (walk/walk construct-pdf-from-clj identity markdownclj))

(defn add-metadata-to-doc-and-remove-nulls
  "Preps the PDF for writing by adding the stylesheet and removing NULLs"
  [pdf-data-structure]
  (->>
    (filter #(not (nil? %)) pdf-data-structure)
    (cons pdf-metadata)
    (vec)))

(defn interpose-spacers
  [pdf-data-structure]
  (interpose [:spacer] pdf-data-structure))

(defn write-pdf
  "Takes a clj-pdf vector description of a PDF and writes it to disk."
  [pdf-data-structure output-file-path]
  (pdf/pdf pdf-data-structure output-file-path))

;; =====================
;; Command Line and Main
;; =====================

(defn process-file
  [input-path output-path report-type]
  (->
    (extract-last-data-block-from-markdown input-path report-type)
    (markdownclj->pdfclj)
    (add-metadata-to-doc-and-remove-nulls)
    (interpose-spacers)
    (write-pdf output-path)))

(defn exit [status msg]
  (println msg)
  (System/exit status))

(def command-line-schema
  [["-h" "--help"]
   ["-t" "--type WEEKLY or MONTHLY"]])

(defn usage
  [options-summary]
  (->> ["Generate a weekly/monthly report based on an input markdown file."
        ""
        "Example Usage: weeklyReport -t WEEKLY inputMarkdown outputDirectory"
        ""
        "Options:"
        options-summary]
       (string/join \newline)))

(defn -main
  [& args]
  (let [cli-params (parse-opts args command-line-schema)
        options (:options cli-params)
        summary (:summary cli-params)
        arguments (:arguments cli-params)]
    (cond
      (:help options) (exit 0 (usage summary))
      (not= (count arguments) 2) (exit 1 (usage summary))
      :default nil)))