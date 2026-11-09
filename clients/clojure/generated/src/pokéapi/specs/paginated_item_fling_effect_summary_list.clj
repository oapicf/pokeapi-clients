(ns pokéapi.specs.paginated-item-fling-effect-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.item-fling-effect-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-item-fling-effect-summary-list-data
  {
   (ds/req :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/req :results) (s/coll-of item-fling-effect-summary-spec)
   })

(def paginated-item-fling-effect-summary-list-spec
  (ds/spec
    {:name ::paginated-item-fling-effect-summary-list
     :spec paginated-item-fling-effect-summary-list-data}))
