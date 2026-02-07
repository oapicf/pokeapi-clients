(ns pokéapi.specs.paginated-move-damage-class-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-damage-class-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-move-damage-class-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of move-damage-class-summary-spec)
   })

(def paginated-move-damage-class-summary-list-spec
  (ds/spec
    {:name ::paginated-move-damage-class-summary-list
     :spec paginated-move-damage-class-summary-list-data}))
