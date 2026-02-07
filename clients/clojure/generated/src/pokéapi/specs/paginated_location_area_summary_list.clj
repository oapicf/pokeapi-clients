(ns pokéapi.specs.paginated-location-area-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.location-area-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-location-area-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of location-area-summary-spec)
   })

(def paginated-location-area-summary-list-spec
  (ds/spec
    {:name ::paginated-location-area-summary-list
     :spec paginated-location-area-summary-list-data}))
