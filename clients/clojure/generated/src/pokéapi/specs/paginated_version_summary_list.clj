(ns pokéapi.specs.paginated-version-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.version-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-version-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of version-summary-spec)
   })

(def paginated-version-summary-list-spec
  (ds/spec
    {:name ::paginated-version-summary-list
     :spec paginated-version-summary-list-data}))
