(ns pokéapi.specs.paginated-version-group-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.version-group-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-version-group-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of version-group-summary-spec)
   })

(def paginated-version-group-summary-list-spec
  (ds/spec
    {:name ::paginated-version-group-summary-list
     :spec paginated-version-group-summary-list-data}))
