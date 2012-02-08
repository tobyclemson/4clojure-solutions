(ns fourclojure-solutions.sum-it-all-up)

(defn sum-it-all-up [coll]
  (reduce + coll))

(= (sum-it-all-up [1 2 3]) 6)

(= (sum-it-all-up (list 0 -2 5 5)) 8)

(= (sum-it-all-up #{4 2 1}) 7)

(= (sum-it-all-up '(0 0 -1)) -1)

(= (sum-it-all-up '(1 10 3)) 14)
