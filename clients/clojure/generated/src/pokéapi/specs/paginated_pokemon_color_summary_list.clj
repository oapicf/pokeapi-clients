(ns pokéapi.specs.paginated-pokemon-color-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-color-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-pokemon-color-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of pokemon-color-summary-spec)
   })

(def paginated-pokemon-color-summary-list-spec
  (ds/spec
    {:name ::paginated-pokemon-color-summary-list
     :spec paginated-pokemon-color-summary-list-data}))
