(ns pokéapi.specs.paginated-contest-type-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.contest-type-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-contest-type-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of contest-type-summary-spec)
   })

(def paginated-contest-type-summary-list-spec
  (ds/spec
    {:name ::paginated-contest-type-summary-list
     :spec paginated-contest-type-summary-list-data}))
