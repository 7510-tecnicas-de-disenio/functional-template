(ns exercise8-test
  (:require [clojure.test :refer :all]
            [exercise8 :refer :all]))

; (deftest fderivative-sin-zero
;   (testing "Does approximate the derivative of sin.")
;   (is (< (- ((fderivative #(Math/sin %) 0.001) 0) 0.9999998333333416) 0.00001)))
;
; (deftest fderivative-sin-five
;   (testing "Does approximate the derivative of sin.")
;   (is (< (- ((fderivative #(Math/sin %) 0.001) 5) 0.2836621381863136) 0.00001)))
;
; (deftest fderivative-square-two
;   (testing "Does approximate the derivative of sin.")
;   (is (< (- ((fderivative square 0.001) 2) 3.9999999999995595) 0.00001)))
;
; (deftest fderivative-square-6
;   (testing "Does approximate the derivative of sin.")
;   (is (< (- ((fderivative square 0.001) 6) 12.000000000004007) 0.00001)))
