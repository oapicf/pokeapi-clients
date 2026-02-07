(ns pokéapi.specs.location-area-detail-pokemon-encounters-inner-version-details-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.location-area-detail-pokemon-encounters-inner-version-details-inner-encounter-details :refer :all]
            )
  (:import (java.io File)))


(def location-area-detail-pokemon-encounters-inner-version-details-inner-data
  {
   (ds/req :version) ability-detail-pokemon-inner-pokemon-spec
   (ds/req :max_chance) int?
   (ds/req :encounter_details) location-area-detail-pokemon-encounters-inner-version-details-inner-encounter-details-spec
   })

(def location-area-detail-pokemon-encounters-inner-version-details-inner-spec
  (ds/spec
    {:name ::location-area-detail-pokemon-encounters-inner-version-details-inner
     :spec location-area-detail-pokemon-encounters-inner-version-details-inner-data}))
