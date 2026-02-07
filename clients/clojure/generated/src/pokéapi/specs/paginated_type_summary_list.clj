(ns pokéapi.specs.paginated-type-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.type-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-type-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of type-summary-spec)
   })

(def paginated-type-summary-list-spec
  (ds/spec
    {:name ::paginated-type-summary-list
     :spec paginated-type-summary-list-data}))
