(ns pokéapi.specs.contest-type-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.berry-flavor-summary :refer :all]
            [pokéapi.specs.contest-type-name :refer :all]
            )
  (:import (java.io File)))


(def contest-type-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :berry_flavor) berry-flavor-summary-spec
   (ds/req :names) (s/coll-of contest-type-name-spec)
   })

(def contest-type-detail-spec
  (ds/spec
    {:name ::contest-type-detail
     :spec contest-type-detail-data}))
