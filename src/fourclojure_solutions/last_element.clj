(ns fourclojure-solutions.last-element)

(defn last-element [seq]
  (-> seq reverse first))

(= (last-element [1 2 3 4 5]) 5)

(= (last-element '(5 4 3)) 3)

(= (last-element ["b" "c" "d"]) "d")
