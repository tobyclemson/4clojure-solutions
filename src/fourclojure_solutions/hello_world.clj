(ns fourclojure-solutions.hello-world)

(defn hello [x]
  (str "Hello, " x "!"))

(= (hello "Dave") "Hello, Dave!")

(= (hello "Jenn") "Hello, Jenn!")

(= (hello "Rhea") "Hello, Rhea!")
