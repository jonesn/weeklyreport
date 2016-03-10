(ns weeklyreport.core
  (require [clojure.tools.cli :refer [parse-opts]]
           [clojure.string :as string]
           [endophile.core :as mdown]
           [com.rpl.specter :as spec])
  (:gen-class))

;; =====
;; Logic
;; =====

(defn weekly-heading-match
  "Helper function to find all weekly headings."
  [markdown-input-element]
  (= :h2 (:tag markdown-input-element)))

(defn monthly-heading-match
  "Helper function to find all monthly headings."
  [markdown-input-element]
  (= :h1 (:tag markdown-input-element)))

(defn tail-of-markdown-from-element
  "Returns the tail block of the document starting from the element passed in matching element."
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

;; =====================
;; Command Line and Main
;; =====================

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