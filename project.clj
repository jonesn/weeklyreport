(defproject weeklyreport "0.1.0-SNAPSHOT"
  :description "Utility to parse and prepare my weekly update."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure    "1.8.0"]
                 [org.clojure/tools.cli  "0.3.3"]]
  :main ^:skip-aot weeklyreport.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
