(ns fourclojure-solutions.rearranging-code-threading-1)

(= (last (sort (rest (reverse [2 5 4 1 3 6]))))
   (-> [2 5 4 1 3 6] reverse rest sort last)
   5)
