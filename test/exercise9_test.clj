(ns exercise9-test
  (:require [clojure.test :refer :all]
            [exercise9 :refer :all]))

(deftest things-for-string
  (testing "Returns the string legend."
   (is (= (things "string") "Soy un String"))))

(deftest things-for-vector
  (testing "Returns the vector legend."
   (is (= (things [1 2 3]) "Soy un Vector"))))

(deftest things-for-map
  (testing "Returns the map legend."
   (is (= (things {:a 1 :b 2}) "Soy un Map"))))

(deftest things-for-int
  (testing "Returns the int legend."
   (is (= (things 1) "Soy un default"))))
