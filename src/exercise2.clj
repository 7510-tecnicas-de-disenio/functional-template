(ns exercise2)

(defn greater-operation [y] (> y 5))
(defn only-greater-than-five [y] (filter greater-operation y))

(only-greater-than-five [1 2 3 4 5 6 7 8 9])

