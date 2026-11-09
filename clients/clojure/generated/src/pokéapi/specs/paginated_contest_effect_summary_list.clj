(ns pokéapi.specs.paginated-contest-effect-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.contest-effect-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-contest-effect-summary-list-data
  {
   (ds/req :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/req :results) (s/coll-of contest-effect-summary-spec)
   })

(def paginated-contest-effect-summary-list-spec
  (ds/spec
    {:name ::paginated-contest-effect-summary-list
     :spec paginated-contest-effect-summary-list-data}))
