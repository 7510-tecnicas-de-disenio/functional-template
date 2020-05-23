(ns exercise10-test
  (:require [clojure.test :refer :all]
            [exercise10 :refer :all]))

; (deftest initial-account-state
;   (testing "Accounts are opened with a balance of 0"
;     (is (= 0 (-> (open-account)
;                  (get-balance))))))

; (deftest increment-and-get-balance
;   (testing "Adding money to the account"
;     (let [account (open-account)
;       account (update-balance account 10)
;      ]
;      (is (= 10 (get-balance account)))
;     )
;   )
; )

; (deftest increment-decrement-and-get-balance
;   (testing "Taking money out of the account"
;     (let [
;       account (open-account)
;       account (update-balance account 10)
;       account (update-balance account -10)
;      ]
;      (is (= 0 (get-balance account)))
;     )
;   )
; )


; (deftest closed-accounts-are-nil
;   (testing "Closing an account makes it nil"
;     (let [
;       account (open-account)
;       account (close-account account)
;      ]
;      (is (nil? (get-balance account)))
;     )
;   )
; )
