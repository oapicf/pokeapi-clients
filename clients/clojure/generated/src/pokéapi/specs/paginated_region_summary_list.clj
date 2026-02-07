(ns pokéapi.specs.paginated-region-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.region-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-region-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of region-summary-spec)
   })

(def paginated-region-summary-list-spec
  (ds/spec
    {:name ::paginated-region-summary-list
     :spec paginated-region-summary-list-data}))
