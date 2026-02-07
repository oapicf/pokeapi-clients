(ns pokéapi.specs.paginated-item-category-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.item-category-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-item-category-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of item-category-summary-spec)
   })

(def paginated-item-category-summary-list-spec
  (ds/spec
    {:name ::paginated-item-category-summary-list
     :spec paginated-item-category-summary-list-data}))
