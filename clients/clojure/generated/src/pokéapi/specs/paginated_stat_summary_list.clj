(ns pokéapi.specs.paginated-stat-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.stat-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-stat-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of stat-summary-spec)
   })

(def paginated-stat-summary-list-spec
  (ds/spec
    {:name ::paginated-stat-summary-list
     :spec paginated-stat-summary-list-data}))
