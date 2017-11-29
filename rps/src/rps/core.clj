(ns rps.core
  (:gen-class))

(defn instream []
  (defn helper []
    (def curr (read))
    (println "stop? (y)")
    (if (= "y" (str curr)) '()
    (cons curr (helper))))
  (lazy-seq
    (helper)))

(defn -main [& args]
  ;;(println "Welcome to my first Clojure Project!")
  ;;(println "These are your args:" args)
  (do (println (instream))))
