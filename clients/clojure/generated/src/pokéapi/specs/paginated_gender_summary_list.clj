(ns pokéapi.specs.paginated-gender-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.gender-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-gender-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of gender-summary-spec)
   })

(def paginated-gender-summary-list-spec
  (ds/spec
    {:name ::paginated-gender-summary-list
     :spec paginated-gender-summary-list-data}))
