(ns exercise2)

(defn only-greater-than-five
  [y]
  (filter (fn [x] (> x 5)) y))

