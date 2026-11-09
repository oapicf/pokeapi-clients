(ns pokéapi.specs.paginated-pokemon-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-pokemon-summary-list-data
  {
   (ds/req :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/req :results) (s/coll-of pokemon-summary-spec)
   })

(def paginated-pokemon-summary-list-spec
  (ds/spec
    {:name ::paginated-pokemon-summary-list
     :spec paginated-pokemon-summary-list-data}))
