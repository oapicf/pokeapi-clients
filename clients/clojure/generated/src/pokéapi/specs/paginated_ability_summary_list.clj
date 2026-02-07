(ns pokéapi.specs.paginated-ability-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-ability-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of ability-summary-spec)
   })

(def paginated-ability-summary-list-spec
  (ds/spec
    {:name ::paginated-ability-summary-list
     :spec paginated-ability-summary-list-data}))
