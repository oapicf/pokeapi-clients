(ns pokéapi.specs.paginated-generation-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.generation-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-generation-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of generation-summary-spec)
   })

(def paginated-generation-summary-list-spec
  (ds/spec
    {:name ::paginated-generation-summary-list
     :spec paginated-generation-summary-list-data}))
