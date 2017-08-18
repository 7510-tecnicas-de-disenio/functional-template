(ns exercise2)

(defn only-greater-than-five
    "filter numbers lower than 5"
    [coll]
    (filter (fn [x] (< 5 x)) coll)
    )
