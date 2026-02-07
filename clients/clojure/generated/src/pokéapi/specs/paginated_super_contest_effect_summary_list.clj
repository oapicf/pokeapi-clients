(ns pokéapi.specs.paginated-super-contest-effect-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.super-contest-effect-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-super-contest-effect-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of super-contest-effect-summary-spec)
   })

(def paginated-super-contest-effect-summary-list-spec
  (ds/spec
    {:name ::paginated-super-contest-effect-summary-list
     :spec paginated-super-contest-effect-summary-list-data}))
