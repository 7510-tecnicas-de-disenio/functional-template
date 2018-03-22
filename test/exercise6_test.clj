(ns exercise6-test
  (:require [clojure.test :refer :all]
            [exercise6 :refer :all]))

(deftest faverage-for-list-of-numbers
  (testing "Returns the average of a list of numbers."
    (is (= (faverage '(1 2 3 4 5 6)) (/ 7 2)))))

(deftest faverage-for-vector-of-nmbers
  (testing "Returns the average of a vector of numbers."
    (is (= (faverage [1 2 3 4 5 6]) (/ 7 2)))))    
