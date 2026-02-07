(ns pokéapi.specs.paginated-evolution-chain-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.evolution-chain-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-evolution-chain-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of evolution-chain-summary-spec)
   })

(def paginated-evolution-chain-summary-list-spec
  (ds/spec
    {:name ::paginated-evolution-chain-summary-list
     :spec paginated-evolution-chain-summary-list-data}))
