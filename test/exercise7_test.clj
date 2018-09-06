(ns exercise7-test
  (:require [clojure.test :refer :all]
              [exercise7 :refer :all]))

(deftest flast-of-array-of-numbers
  (testing "Returns the last element of an array of numbers."
    (is (= (fnth 1 [1 2 3 4]) 2))))

(deftest flast-of-a-list-of-numbers
  (testing "Returns the nth element of a list of numbers."
    (is (= (fnth 2 '(4 5 6 7)) 6))))

(deftest flast-of-array-of-strings
  (testing "Returns the nth element of an array of strings."
    (is (= (fnth 0 [:a :b :c]) :a))))

(deftest flast-of-a-list-of-strings
  (testing "Returns the last element of a list."
    (is (= (fnth 2 '([1 2] [3 4] [5 6])) [5 6]))))