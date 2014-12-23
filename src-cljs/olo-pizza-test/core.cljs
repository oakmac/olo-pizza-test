(ns olo-pizza-test.core
  (:require
    [clojure.string :refer [join]]
    [clojure.walk :refer [keywordize-keys]]))

(defn- js-log [js-thing]
  (.log js/console js-thing))

(defn- print-topping [idx [toppings order-count]]
  (js-log (str
    "#" (inc idx) " - "
    order-count " orders: "
    (apply str (join ", " toppings)))))

(defn- val-sort [[_toppings-a count-a] [_toppings-b count-b]]
  (compare count-b count-a))

(defn -main []
  (->> (js/require "./pizzas.json")
       js->clj
       keywordize-keys
       (map :toppings)
       frequencies
       (sort val-sort)
       (take 20)
       (map-indexed print-topping)
       doall))

(set! *main-cli-fn* -main)
