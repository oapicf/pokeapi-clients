(ns pokéapi.specs.location-area-detail-pokemon-encounters-inner-version-details-inner-encounter-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def location-area-detail-pokemon-encounters-inner-version-details-inner-encounter-details-data
  {
   (ds/req :min_level) int?
   (ds/req :max_level) int?
   (ds/opt :condition_values) ability-detail-pokemon-inner-pokemon-spec
   (ds/req :chance) int?
   (ds/req :method) ability-detail-pokemon-inner-pokemon-spec
   })

(def location-area-detail-pokemon-encounters-inner-version-details-inner-encounter-details-spec
  (ds/spec
    {:name ::location-area-detail-pokemon-encounters-inner-version-details-inner-encounter-details
     :spec location-area-detail-pokemon-encounters-inner-version-details-inner-encounter-details-data}))
