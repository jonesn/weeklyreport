(ns weeklyreport.core-test
  (:require [clojure.test :refer :all]
            [weeklyreport.core :refer :all]
            [clj-time.local :as localtime]))

(deftest test-pdf-multimethod-simplecases
  (testing "Testing the various mapings from my Markdown datastructure to a CLJ PDF supported one."
    (is
      (=
        [:heading heading-two-style "Feb 2016-02-15 -> 2016-02-21"]
        (construct-pdf-from-clj {:tag :h2, :content '("Feb 2016-02-15 -" ">" " 2016-02-21")})))
    (is
      (=
        [:paragraph paragraph-style "I was in Australia last week."]
        (construct-pdf-from-clj {:tag :p, :content '("I was in Australia last week.")})))))

;; ===========================
;; Markdown List Special Case
;; ===========================

(def list-input
  {:tag     :ul,
   :content '({:tag     :li,
               :content ("["
                          "Operations Redcon"
                          "]"
                          " Wholesale Settlement.")}
               {:tag     :li,
                :content ("["
                           "Operations Linux WR 27783"
                           "]"
                           " Following up on permissions issue for new file system shares.")})})

(def expected-list
  [:list {:indent 10}
   "[Operations Redcon] Wholesale Settlement."
   "[Operations Linux WR 27783] Following up on permissions issue for new file system shares."])

(deftest test-pdf-multimethod-list-case
  (testing "That list elements are correctly traversed and constructed.")
  (is
    (= expected-list
       (construct-pdf-from-clj list-input))))

;; ==================
;; File Path Handling
;; ==================

(deftest test-decide-output-file-name
  (is
    (= "outputdir/arachnid_red_weeklyreport_20160328_20160403.pdf"
       (decide-output-file-name "outputdir" "WEEKLY" (localtime/to-local-date-time "2016-04-04T02:00:00.000"))))
  (is
    (= "outputdir/arachnid_red_monthlyreport_201603.pdf"
       (decide-output-file-name "outputdir" "MONTHLY" (localtime/to-local-date-time "2016-04-04T02:00:00.000")))))
