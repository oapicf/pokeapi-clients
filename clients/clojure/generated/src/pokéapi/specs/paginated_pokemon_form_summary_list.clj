(ns pokéapi.specs.paginated-pokemon-form-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-form-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-pokemon-form-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of pokemon-form-summary-spec)
   })

(def paginated-pokemon-form-summary-list-spec
  (ds/spec
    {:name ::paginated-pokemon-form-summary-list
     :spec paginated-pokemon-form-summary-list-data}))
