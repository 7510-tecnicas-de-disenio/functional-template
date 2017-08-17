(ns exercise2-test
  (:require [clojure.test :refer :all]
            [exercise2 :refer :all]))

(deftest only-greater-than-five-test-empty-list
  (testing "Tests to filter an empty list."
    (is (= (only-greater-than-five '()) '()))))

(deftest only-greater-than-five-test-empty-list
  (testing "Tests to filter an empty list."
    (is (= (only-greater-than-five '()) '()))))

(deftest only-greater-than-five-test-less-than-five-elements
  (testing "Tests to filter a list with elements that are less than five."
    (is (= (only-greater-than-five '(1 2 3 4)) '()))))

(deftest only-greater-than-five-test-only-element-five
  (testing "Tests to filter a list with only one element which is the number five."
    (is (= (only-greater-than-five '(5)) '()))))	
	
(deftest only-greater-than-five-test-greater-than-five-elements
  (testing "Tests to filter a list with elements that are less than five."
    (is (= (only-greater-than-five '(6 7)) '(6 7)))))