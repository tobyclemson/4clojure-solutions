(ns fourclojure-solutions.count-a-sequence)

(defn count-elements [seq]
  (loop [remaining-elements seq
         count 0]
    (if (empty remaining-elements)
      count
      (recur (rest remaining-elements) (inc count)))))

(= (count-elements '(1 2 3 3 1)) 5)

(= (count-elements "Hello World") 11)

(= (count-elements [[1 2] [3 4] [5 6]]) 3)

(= (count-elements '(13)) 1)

(= (count-elements '(:a :b :c)) 3)
