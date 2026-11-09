(ns pokéapi.specs.location-area-encounter-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.encounter-method-summary :refer :all]
            [pokéapi.specs.encounter-condition-value-summary :refer :all]
            [pokéapi.specs.encounter-pokemon-detail :refer :all]
            )
  (:import (java.io File)))


(def location-area-encounter-detail-data
  {
   (ds/req :min_level) int?
   (ds/req :max_level) int?
   (ds/opt :chance) int?
   (ds/opt :method) encounter-method-summary-spec
   (ds/req :condition_values) (s/coll-of encounter-condition-value-summary-spec)
   (ds/req :pokemon_details) encounter-pokemon-detail-spec
   })

(def location-area-encounter-detail-spec
  (ds/spec
    {:name ::location-area-encounter-detail
     :spec location-area-encounter-detail-data}))
