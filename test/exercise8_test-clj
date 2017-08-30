(ns exercise8-test
  (:require [clojure.test :refer :all]
            [exercise8 :refer :all]))
                
(defn squear 
  "Returns the squear of a given number"
  [x]
  (
    * x x
   )
)          

(deftest fderive-sin-zero
  (testing "Does approximate the derive of sin."
  (is (= ((fderive #(Math/sin %) 0.001) 0) 0.9999998333333416))))
			    
(deftest fderive-sin-five
  (testing "Does approximate the derive of sin."
  (is (= ((fderive #(Math/sin %) 0.001) 5) 0.2836621381863136))))
			    
(deftest fderive-squear-two
  (testing "Does approximate the derive of sin."
  (is (= ((fderive squear 0.001) 2) 3.9999999999995595))))
						    
(deftest fderive-squear-6
  (testing "Does approximate the derive of sin."
  (is (= ((fderive squear 0.001) 6) 12.000000000004007))))
