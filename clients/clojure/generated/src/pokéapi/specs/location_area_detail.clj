(ns pokéapi.specs.location-area-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.location-area-detail-encounter-method-rates-inner :refer :all]
            [pokéapi.specs.location-summary :refer :all]
            [pokéapi.specs.location-area-name :refer :all]
            [pokéapi.specs.location-area-detail-pokemon-encounters-inner :refer :all]
            )
  (:import (java.io File)))


(def location-area-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :game_index) int?
   (ds/req :encounter_method_rates) (s/coll-of location-area-detail-encounter-method-rates-inner-spec)
   (ds/req :location) location-summary-spec
   (ds/req :names) (s/coll-of location-area-name-spec)
   (ds/req :pokemon_encounters) (s/coll-of location-area-detail-pokemon-encounters-inner-spec)
   })

(def location-area-detail-spec
  (ds/spec
    {:name ::location-area-detail
     :spec location-area-detail-data}))
