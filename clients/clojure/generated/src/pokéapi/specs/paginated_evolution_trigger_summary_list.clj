(ns pokéapi.specs.paginated-evolution-trigger-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.evolution-trigger-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-evolution-trigger-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of evolution-trigger-summary-spec)
   })

(def paginated-evolution-trigger-summary-list-spec
  (ds/spec
    {:name ::paginated-evolution-trigger-summary-list
     :spec paginated-evolution-trigger-summary-list-data}))
