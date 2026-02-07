(ns pokéapi.specs.paginated-pokeathlon-stat-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokeathlon-stat-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-pokeathlon-stat-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of pokeathlon-stat-summary-spec)
   })

(def paginated-pokeathlon-stat-summary-list-spec
  (ds/spec
    {:name ::paginated-pokeathlon-stat-summary-list
     :spec paginated-pokeathlon-stat-summary-list-data}))
