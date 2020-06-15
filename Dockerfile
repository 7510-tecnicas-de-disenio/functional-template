FROM clojure

WORKDIR .

COPY . .

CMD lein test 
