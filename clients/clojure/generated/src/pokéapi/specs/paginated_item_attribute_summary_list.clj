(ns pokéapi.specs.paginated-item-attribute-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.item-attribute-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-item-attribute-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of item-attribute-summary-spec)
   })

(def paginated-item-attribute-summary-list-spec
  (ds/spec
    {:name ::paginated-item-attribute-summary-list
     :spec paginated-item-attribute-summary-list-data}))
