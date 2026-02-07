(ns pokéapi.specs.paginated-pokemon-habitat-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-habitat-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-pokemon-habitat-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of pokemon-habitat-summary-spec)
   })

(def paginated-pokemon-habitat-summary-list-spec
  (ds/spec
    {:name ::paginated-pokemon-habitat-summary-list
     :spec paginated-pokemon-habitat-summary-list-data}))
