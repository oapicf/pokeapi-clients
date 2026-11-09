(ns pokéapi.specs.currency-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.currency-name :refer :all]
            )
  (:import (java.io File)))


(def currency-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :names) (s/coll-of currency-name-spec)
   })

(def currency-detail-spec
  (ds/spec
    {:name ::currency-detail
     :spec currency-detail-data}))
