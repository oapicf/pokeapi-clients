(ns pokéapi.specs.paginated-move-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-move-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of move-summary-spec)
   })

(def paginated-move-summary-list-spec
  (ds/spec
    {:name ::paginated-move-summary-list
     :spec paginated-move-summary-list-data}))
