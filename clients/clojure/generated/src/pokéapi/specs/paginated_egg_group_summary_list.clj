(ns pokéapi.specs.paginated-egg-group-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.egg-group-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-egg-group-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of egg-group-summary-spec)
   })

(def paginated-egg-group-summary-list-spec
  (ds/spec
    {:name ::paginated-egg-group-summary-list
     :spec paginated-egg-group-summary-list-data}))
