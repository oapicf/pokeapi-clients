(ns pokéapi.specs.paginated-location-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.location-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-location-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of location-summary-spec)
   })

(def paginated-location-summary-list-spec
  (ds/spec
    {:name ::paginated-location-summary-list
     :spec paginated-location-summary-list-data}))
