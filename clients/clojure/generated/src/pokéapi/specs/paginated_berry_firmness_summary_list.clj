(ns pokéapi.specs.paginated-berry-firmness-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.berry-firmness-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-berry-firmness-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of berry-firmness-summary-spec)
   })

(def paginated-berry-firmness-summary-list-spec
  (ds/spec
    {:name ::paginated-berry-firmness-summary-list
     :spec paginated-berry-firmness-summary-list-data}))
