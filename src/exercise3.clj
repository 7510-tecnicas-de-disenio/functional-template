(ns exercise3)

(defn fibonacci
  [x]
  (if (or (= x 1) (= x 0))
    x
    (+ (fibonacci (- x 1)) (fibonacci (- x 2)))
  )
)
