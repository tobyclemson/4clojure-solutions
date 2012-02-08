(ns fourclojure-solutions.find-the-odd-numbers)

(defn find-the-odd-numbers [coll]
  (filter #(= 1 (mod % 2)) coll))

(= (find-the-odd-numbers #{1 2 3 4 5}) '(1 3 5))

(= (find-the-odd-numbers [4 2 1 6]) '(1))

(= (find-the-odd-numbers [2 2 4 6]) '())

(= (find-the-odd-numbers [1 1 1 3]) '(1 1 1 3))
