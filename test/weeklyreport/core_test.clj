(ns weeklyreport.core-test
  (:require [clojure.test :refer :all]
            [weeklyreport.core :refer :all]))

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
  [:list
   {:roman true}
   "[Operations Redcon] Wholesale Settlement."
   "[Operations Linux WR 27783] Following up on permissions issue for new file system shares."])

(deftest test-pdf-multimethod-list-case
  (testing "That list elements are correctly traversed and constructed.")
  (is
    (= expected-list
       (construct-pdf-from-clj list-input))))
