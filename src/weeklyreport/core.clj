(ns weeklyreport.core
  (require [clojure.tools.cli :refer [parse-opts]]
           [clojure.string :as string]
           [endophile.core :as mdown]
           [com.rpl.specter :as spec]
           [clojure.walk :as walk]
           [clj-pdf.core :as pdf]
           [clj-time.local :as localtime]
           [clj-time.core :as time]
           [clj-time.format :as timefmt]
           [clj-time.predicates :as timepred])
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
  "Takes the given file path pointing to a markdown file and loads that file into a clojure datastructure."
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

(def heading-color-blue [98 190 255])

(def heading-color-grey [150 150 150])

(def pdf-metadata
  {:title  "Arachnid Work Report."
   :author "Nick Jones"})

(def header-block
  [:table {:width 100 :widths [92 8] :border-width 0}
   [[:cell [:phrase {:style :italic :size 8 :family :helvetica :color heading-color-grey} (str "Generated: " (localtime/local-now))]]
    [:cell [:image {:xscale 0.5 :yscale 0.5} (javax.imageio.ImageIO/read
                                               (-> "header_logo_blue.png"
                                                   clojure.java.io/resource
                                                   clojure.java.io/input-stream))]]]])

(def heading-one-style
  {:style
   {:size   18
    :color  heading-color-blue
    :family :helvetica}})

(def heading-two-style
  {:style
   {:size   16
    :color  heading-color-blue
    :family :helvetica}})

(def heading-three-style
  {:style
   {:size   14
    :color  heading-color-grey
    :family :helvetica}})

;; For some reason a paragraph style is different to a header style.
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
  "This method is called from the multimethod to handle the construction of a list."
  [root-list-element]
  (when-let [seq-of-li-elements (:content root-list-element)]
    (vec
      (into [:list {:indent 10}]
            (vec
              (map
                #(apply str (:content %))
                seq-of-li-elements))))))

(defn add-metadata-to-doc-and-remove-nulls
  "Preps the PDF for writing by adding the stylesheet and removing NULLs"
  [pdf-data-structure]
  (->>
    (filter #(not (nil? %)) pdf-data-structure)
    (cons header-block)
    (cons pdf-metadata)
    (vec)))

(defn interpose-spacers
  [pdf-data-structure]
  (interpose [:spacer] pdf-data-structure))

(defn write-pdf
  "Takes a clj-pdf vector description of a PDF and writes it to disk."
  [pdf-data-structure output-file-path]
  (pdf/pdf pdf-data-structure output-file-path))

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
  (println (str "Won't convert element of type: ." element-map)))

(defn markdownclj->pdfclj
  [markdownclj]
  (walk/walk construct-pdf-from-clj identity markdownclj))

;; ===========
;; File Naming
;; ===========

(def month-formatter (timefmt/formatter "yyyyMM"))

(defn find-day-of-week
  [base-date operator day-of-week-pred]
  (loop [start-date base-date]
    (if (day-of-week-pred start-date)
      start-date
      (recur (operator start-date (time/days 1))))))

(defn weekly-file-name-string
  [run-date]
  (let [date-last-week (time/minus run-date (time/weeks 1))
        last-monday (find-day-of-week date-last-week time/minus timepred/monday?)
        last-sunday (find-day-of-week date-last-week time/plus timepred/sunday?)]
    (str (localtime/format-local-time last-monday :basic-date)
         "_"
         (localtime/format-local-time last-sunday :basic-date))))

(defn monthly-file-name-string
  [run-date]
  (let [date-last-month (time/minus run-date (time/months 1))]
    (timefmt/unparse month-formatter date-last-month)))

(defn decide-output-file-name
  [output-path report-type run-date]
  (let [param-map
        (cond
          (= report-type "WEEKLY") {:report-type "weeklyreport" :date-string (weekly-file-name-string run-date)}
          (= report-type "MONTHLY") {:report-type "monthlyreport" :date-string (monthly-file-name-string run-date)})]
    (str output-path "/arachnid_red_" (:report-type param-map) "_" (:date-string param-map) ".pdf")))

;; =====================
;; Command Line and Main
;; =====================

(defn process-file
  [input-file output-path report-type]
  (->
    (extract-last-data-block-from-markdown input-file report-type)
    (markdownclj->pdfclj)
    (add-metadata-to-doc-and-remove-nulls)
    (interpose-spacers)
    (write-pdf (decide-output-file-name output-path report-type (localtime/local-now)))))

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
        options    (:options cli-params)
        summary    (:summary cli-params)
        arguments  (:arguments cli-params)]
    (cond
      (:help options)            (exit 0 (usage summary))
      (not= (count arguments) 2) (exit 1 (usage summary))
      :default                   (process-file
                                   (first arguments)
                                   (second arguments)
                                   (:type options)))))