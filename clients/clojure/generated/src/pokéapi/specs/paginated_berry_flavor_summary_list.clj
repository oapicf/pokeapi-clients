(ns pokéapi.specs.paginated-berry-flavor-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.berry-flavor-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-berry-flavor-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of berry-flavor-summary-spec)
   })

(def paginated-berry-flavor-summary-list-spec
  (ds/spec
    {:name ::paginated-berry-flavor-summary-list
     :spec paginated-berry-flavor-summary-list-data}))
