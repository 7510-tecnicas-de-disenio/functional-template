(ns exercise3)

(defn fibo ([n] (fibo [0 1] n)) 
  ([x,n] (if (< (count x) n) 
    (fibo (conj x (+ (last x) (nth x ( - (count x) 2)))) n) x)))

(defn fibonacci [x] (get (fibo (+ x 1)) x ))

