(ns fourclojure-solutions.penultimate-element)

(defn penultimate-element [seq]
  (-> seq reverse second))

(= (penultimate-element (list 1 2 3 4 5)) 4)

(= (penultimate-element ["a" "b" "c"]) "b")

(= (penultimate-element [[1 2] [3 4]]) [1 2])
