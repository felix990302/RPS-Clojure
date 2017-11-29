(defproject rps "0.1.0-SNAPSHOT"
  :description "Rock, Paper, Scissors!"
  :url "felix-zhou.me"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-http "2.0.0"]]
  :main ^:skip-aot rps.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
