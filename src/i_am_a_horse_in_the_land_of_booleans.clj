(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
	(if (or (nil? x) (false? x)) false true))

(defn abs [x]
  (if (< x 0) (* x -1) (* x 1)))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
    (= 0 (mod n 15)) "gotcha!"
    (= 0 (mod n 3)) "fizz"
    (= 0 (mod n 5)) "buzz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (cond 
    (and (= 0 (mod year 4)) (not (= 0 (mod year 100)))) true
    (= 0 (mod year 400)) true
    :else false))

; '_______'
