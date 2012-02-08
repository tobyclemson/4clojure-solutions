(ns fourclojure-solutions.a-nil-key)

(defn is-key-with-nil-value [key map]
  (and (contains? map key) (nil? (key map))))

(true?  (is-key-with-nil-value :a {:a nil :b 2}))

(false? (is-key-with-nil-value :b {:a nil :b 2}))

(false? (is-key-with-nil-value :c {:a nil :b 2}))
