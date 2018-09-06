(ns exercise11)


(defn fmap-nil [map key]
    (= (get map key) nil)
)
