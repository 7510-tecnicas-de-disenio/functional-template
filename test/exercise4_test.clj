(ns exercise4-test
  (:require [clojure.test :refer :all]
            [exercise4 :refer :all]))

; (deftest summary-array
;   (testing "Tests sum applied to an array of numbers."
;     (is (= (summary [1 2 3]) 6))))

; (deftest summary-list
;   (testing "Tests sum applied to a list of numbers."
;     (is (= (summary (list 0 -2 5 5)) 8))))	
	
; (deftest summary-set
;   (testing "Tests sum applied to a set of numbers."
;     (is (= (summary #{4 2 1}) 7))))	
	
; (deftest summary-negative
;   (testing "Tests sum applied to a sequence with negative numbers."
;     (is (= (summary '(0 0 -1)) -1))))

; (deftest summary-positive
;   (testing "Tests sum applied to a sequence with all positive numbers."
;     (is (= (summary '(1 10 3)) 14))))