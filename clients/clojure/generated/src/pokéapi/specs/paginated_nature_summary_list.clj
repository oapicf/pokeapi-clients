(ns pokéapi.specs.paginated-nature-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.nature-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-nature-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of nature-summary-spec)
   })

(def paginated-nature-summary-list-spec
  (ds/spec
    {:name ::paginated-nature-summary-list
     :spec paginated-nature-summary-list-data}))
