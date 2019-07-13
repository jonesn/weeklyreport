(defproject weeklyreport "1.0.0"
  :description "Utility to parse and prepare my weekly update pdf from a markdown file."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.cli "0.3.5"]
                 [endophile "0.2.1"]
                 [clj-pdf "2.2.29"]
                 [clj-time "0.14.0"]
                 [com.rpl/specter "1.0.3"]]
  :main ^:skip-aot weeklyreport.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
