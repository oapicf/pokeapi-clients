(ns pokéapi.specs.paginated-move-learn-method-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-learn-method-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-move-learn-method-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of move-learn-method-summary-spec)
   })

(def paginated-move-learn-method-summary-list-spec
  (ds/spec
    {:name ::paginated-move-learn-method-summary-list
     :spec paginated-move-learn-method-summary-list-data}))
