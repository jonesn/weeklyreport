(defproject weeklyreport "0.1.0-SNAPSHOT"
  :description "Utility to parse and prepare my weekly update pdf from a markdown file."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.cli "0.3.3"]
                 [endophile "0.1.2"]
                 [clj-pdf "2.2.0"]
                 [com.rpl/specter "0.9.2"]]
  :main ^:skip-aot weeklyreport.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
