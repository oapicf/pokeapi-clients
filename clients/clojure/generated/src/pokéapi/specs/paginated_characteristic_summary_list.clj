(ns pokéapi.specs.paginated-characteristic-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.characteristic-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-characteristic-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of characteristic-summary-spec)
   })

(def paginated-characteristic-summary-list-spec
  (ds/spec
    {:name ::paginated-characteristic-summary-list
     :spec paginated-characteristic-summary-list-data}))
