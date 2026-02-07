(ns pokéapi.specs.paginated-pokedex-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokedex-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-pokedex-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of pokedex-summary-spec)
   })

(def paginated-pokedex-summary-list-spec
  (ds/spec
    {:name ::paginated-pokedex-summary-list
     :spec paginated-pokedex-summary-list-data}))
