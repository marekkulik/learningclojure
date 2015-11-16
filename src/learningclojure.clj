(ns learningclojure)

(str "Hello" " " "world")

(take 4 (range))

(cons 4 [1 2 3])
(cons 4 (list 1 2 3))

(conj [1 2 3] 4)
(conj '(1 2 3) 4)

(concat [1 2] (list 3 4))
(concat (list 1 2) [3 4])

(map inc (1 2 3))
(filter even? [1 2 3])
(reduce + [1 2 3 4])

(def hello-world (fn [] "Hello world"))
(hello-world)

(defn bye-world [] "Bye world")
(bye-world)

(defn add-three [num] (+ 3 num))
(add-three 2)

(defn count-args [& args]
  (str "You passed " (count args) " args: " args))
(count-args 1 2 3)