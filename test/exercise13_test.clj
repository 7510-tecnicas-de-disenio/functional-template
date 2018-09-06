(ns exercise13-test
  (:require [clojure.test :refer :all]
            [exercise13 :refer :all]))

(deftest fseparar-lista-numeros
  (testing "Returns the a list separated by index of a list of numbers."
    (is (= (separar 3 [1 2 3 4 5 6]) [(1 2 3) (4 5 6)]))))

(deftest fseparar-lista-letras
  (testing "Returns the a list separated by index of a list of letters."
    (is (= (separar 1 [:a :b :c :d]) [(:a) (:b :c :d)]))))  
    
    
(deftest fseparar-lista-listas
  (testing "Returns the a list separated by index of a list of lists."
    (is (= (separar 2 [[1 2] [3 4] [5 6]]) [([1 2] [3 4]) ([5 6])]))))  
