(ns pokéapi.specs.paginated-encounter-method-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.encounter-method-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-encounter-method-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of encounter-method-summary-spec)
   })

(def paginated-encounter-method-summary-list-spec
  (ds/spec
    {:name ::paginated-encounter-method-summary-list
     :spec paginated-encounter-method-summary-list-data}))
