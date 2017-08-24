(ns exercise2)

(defn only-greater-than-five
  [toFilter]
  (filter #(< 5 %) toFilter))
