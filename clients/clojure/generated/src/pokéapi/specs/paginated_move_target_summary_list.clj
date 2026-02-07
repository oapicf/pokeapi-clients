(ns pokéapi.specs.paginated-move-target-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-target-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-move-target-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of move-target-summary-spec)
   })

(def paginated-move-target-summary-list-spec
  (ds/spec
    {:name ::paginated-move-target-summary-list
     :spec paginated-move-target-summary-list-data}))
