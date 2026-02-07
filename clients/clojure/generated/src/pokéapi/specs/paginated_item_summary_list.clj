(ns pokéapi.specs.paginated-item-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.item-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-item-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of item-summary-spec)
   })

(def paginated-item-summary-list-spec
  (ds/spec
    {:name ::paginated-item-summary-list
     :spec paginated-item-summary-list-data}))
