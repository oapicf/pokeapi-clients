(ns pokéapi.specs.paginated-pokemon-species-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-pokemon-species-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of pokemon-species-summary-spec)
   })

(def paginated-pokemon-species-summary-list-spec
  (ds/spec
    {:name ::paginated-pokemon-species-summary-list
     :spec paginated-pokemon-species-summary-list-data}))
