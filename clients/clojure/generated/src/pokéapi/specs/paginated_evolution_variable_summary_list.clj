(ns pokéapi.specs.paginated-evolution-variable-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.evolution-variable-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-evolution-variable-summary-list-data
  {
   (ds/req :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/req :results) (s/coll-of evolution-variable-summary-spec)
   })

(def paginated-evolution-variable-summary-list-spec
  (ds/spec
    {:name ::paginated-evolution-variable-summary-list
     :spec paginated-evolution-variable-summary-list-data}))
