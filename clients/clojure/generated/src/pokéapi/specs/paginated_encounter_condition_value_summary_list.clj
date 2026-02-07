(ns pokéapi.specs.paginated-encounter-condition-value-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.encounter-condition-value-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-encounter-condition-value-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of encounter-condition-value-summary-spec)
   })

(def paginated-encounter-condition-value-summary-list-spec
  (ds/spec
    {:name ::paginated-encounter-condition-value-summary-list
     :spec paginated-encounter-condition-value-summary-list-data}))
