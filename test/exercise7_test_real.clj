(ns exercise7-test
  (:require [clojure.test :refer :all]
              [exercise7 :refer :all]))

(deftest fmap-list
  (testing "Maps values in a list."
   (is (= (fmap inc (list 1 2 3)) (list 2 3 4)))))
   
(deftest fmap-vector
  (testing "Maps values in a vector."
   (is (= (fmap inc [1 2 3 4]) [2 3 4 5]))))
			    
(deftest fmap-map
  (testing "Maps values in a map."
   (is (= (fmap inc {:a 1 :b 2}) {:a 2 :b 3}))))
