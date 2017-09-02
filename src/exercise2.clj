(ns exercise2)

(defn only-greater-than-five
  "Filter a list by only it's elements that are greater than five."
  
  [list]
  
  (filter 
  	(fn [item] (> item 5))
  	list
  )

)