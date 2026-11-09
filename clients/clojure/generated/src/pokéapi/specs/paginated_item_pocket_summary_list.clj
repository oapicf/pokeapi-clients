(ns pokéapi.specs.paginated-item-pocket-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.item-pocket-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-item-pocket-summary-list-data
  {
   (ds/req :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/req :results) (s/coll-of item-pocket-summary-spec)
   })

(def paginated-item-pocket-summary-list-spec
  (ds/spec
    {:name ::paginated-item-pocket-summary-list
     :spec paginated-item-pocket-summary-list-data}))
