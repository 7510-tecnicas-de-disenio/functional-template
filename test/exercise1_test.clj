(ns exercise1-test
  (:require [clojure.test :refer :all]
            [exercise1 :refer :all]))

(deftest ten-minus-by-two-test-positive
  (testing "Tests with a value that makes the result positive."
    (is (= (ten-minus-by-two 4) 2))))

(deftest ten-minus-by-two-test-negative
  (testing "Tests with a value that makes the result negative."
    (is (= (ten-minus-by-two 7) -4))))

(deftest ten-minus-by-two-test-zero
  (testing "Tests with a value that makes the result zero."
    (is (= (ten-minus-by-two 5) 0))))
