(ns pokéapi.specs.paginated-currency-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.currency-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-currency-summary-list-data
  {
   (ds/req :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/req :results) (s/coll-of currency-summary-spec)
   })

(def paginated-currency-summary-list-spec
  (ds/spec
    {:name ::paginated-currency-summary-list
     :spec paginated-currency-summary-list-data}))
