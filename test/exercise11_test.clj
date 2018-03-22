(ns exercise11-test
  (:require [clojure.test :refer :all]
            [exercise11 :refer :all]))

(def test-map {:a nil :b 1 :c 2})

(deftest fmap-nil-for-nil-value
    (is (= (fmap-nil test-map :a) true)))

(deftest fmap-nil-for-non-nil-value
    (is (= (fmap-nil test-map :b) false)))

(deftest fmap-nil-for-non-nil-value
    (is (= (fmap-nil test-map :c) false)))
