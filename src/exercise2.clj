(ns exercise2)

(defn only-greater-than-five
  "Filters a stream keeping only greater than five elements."
  [stream]
  (filter (fn [x] (> x 5)) stream))

