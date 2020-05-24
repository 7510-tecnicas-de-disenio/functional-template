(ns exercise3)

(defn fibonacci [x]
  "Calculates the fibonacci result fo the given input value."
  (if (< x 2) 
  x
  (+ (fibonacci(- x 1)) (fibonacci(- x 2)))
  )
)
