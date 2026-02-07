(ns pokéapi.specs.paginated-growth-rate-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.growth-rate-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-growth-rate-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of growth-rate-summary-spec)
   })

(def paginated-growth-rate-summary-list-spec
  (ds/spec
    {:name ::paginated-growth-rate-summary-list
     :spec paginated-growth-rate-summary-list-data}))
