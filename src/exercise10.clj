(ns exercise10)

(defn open-account []
  (hash-map :balance 0)
)

(defn close-account [account]
  (dissoc account :balance)
)

(defn get-balance [account]
  (get account :balance)
)

(defn update-balance [account amount]
  (update account :balance + amount)
)
