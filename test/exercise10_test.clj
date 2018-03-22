(ns exercise10-test
  (:require [clojure.test :refer :all]
            [exercise10 :refer :all]))

(deftest fvariance-for-list-of-numbers
  (testing "Returns the variance of a list of numbers."
    (is (= (fvariance '(1 2 3 4 5 6)) (/ 35 12)))))
