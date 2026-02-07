(ns pokéapi.specs.berry-flavor-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.berry-flavor-detail-berries-inner :refer :all]
            [pokéapi.specs.contest-type-summary :refer :all]
            [pokéapi.specs.berry-flavor-name :refer :all]
            )
  (:import (java.io File)))


(def berry-flavor-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :berries) (s/coll-of berry-flavor-detail-berries-inner-spec)
   (ds/req :contest_type) contest-type-summary-spec
   (ds/req :names) (s/coll-of berry-flavor-name-spec)
   })

(def berry-flavor-detail-spec
  (ds/spec
    {:name ::berry-flavor-detail
     :spec berry-flavor-detail-data}))
