(ns pokéapi.specs.paginated-machine-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.machine-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-machine-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of machine-summary-spec)
   })

(def paginated-machine-summary-list-spec
  (ds/spec
    {:name ::paginated-machine-summary-list
     :spec paginated-machine-summary-list-data}))
