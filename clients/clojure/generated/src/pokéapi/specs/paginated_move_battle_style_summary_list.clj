(ns pokéapi.specs.paginated-move-battle-style-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-battle-style-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-move-battle-style-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of move-battle-style-summary-spec)
   })

(def paginated-move-battle-style-summary-list-spec
  (ds/spec
    {:name ::paginated-move-battle-style-summary-list
     :spec paginated-move-battle-style-summary-list-data}))
