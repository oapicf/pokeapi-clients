(ns pokéapi.specs.paginated-pokemon-shape-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-shape-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-pokemon-shape-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of pokemon-shape-summary-spec)
   })

(def paginated-pokemon-shape-summary-list-spec
  (ds/spec
    {:name ::paginated-pokemon-shape-summary-list
     :spec paginated-pokemon-shape-summary-list-data}))
