(ns pokéapi.specs.paginated-encounter-condition-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.encounter-condition-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-encounter-condition-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of encounter-condition-summary-spec)
   })

(def paginated-encounter-condition-summary-list-spec
  (ds/spec
    {:name ::paginated-encounter-condition-summary-list
     :spec paginated-encounter-condition-summary-list-data}))
