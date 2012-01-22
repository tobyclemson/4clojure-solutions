(ns fourclojure-solutions.nth-element)

(defn nth-element [seq n]
  (first (drop n seq)))

(= (nth-element '(4 5 6 7) 2) 6)

(= (nth-element [:a :b :c] 0) :a)

(= (nth-element [1 2 3 4] 1) 2)

(= (nth-element [[1 2] [3 4] [5 6]] 2) [5 6])
