(ns pokéapi.specs.paginated-berry-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.berry-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-berry-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of berry-summary-spec)
   })

(def paginated-berry-summary-list-spec
  (ds/spec
    {:name ::paginated-berry-summary-list
     :spec paginated-berry-summary-list-data}))
