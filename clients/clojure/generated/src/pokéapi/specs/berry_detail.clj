(ns pokéapi.specs.berry-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.berry-firmness-summary :refer :all]
            [pokéapi.specs.berry-detail-flavors-inner :refer :all]
            [pokéapi.specs.item-summary :refer :all]
            [pokéapi.specs.type-summary :refer :all]
            )
  (:import (java.io File)))


(def berry-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :growth_time) int?
   (ds/req :max_harvest) int?
   (ds/req :natural_gift_power) int?
   (ds/req :size) int?
   (ds/req :smoothness) int?
   (ds/req :soil_dryness) int?
   (ds/req :firmness) berry-firmness-summary-spec
   (ds/req :flavors) (s/coll-of berry-detail-flavors-inner-spec)
   (ds/req :item) item-summary-spec
   (ds/req :natural_gift_type) type-summary-spec
   })

(def berry-detail-spec
  (ds/spec
    {:name ::berry-detail
     :spec berry-detail-data}))
