(ns exercise7-test
  (:require [clojure.test :refer :all]
              [exercise7 :refer :all]))

(deftest map-increment-vector
 (testing "Maps and increments the values in a vector."
  (is (= (map increment [1 2 3 4]) [2 3 4 5]))))

(deftest map-increment-list
 (testing "Maps and increments the values in a list."
  (is (= (map increment '(1 2 3)) '(2 3 4)))))
