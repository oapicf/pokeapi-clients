(ns pokéapi.specs.gender-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.gender-detail-pokemon-species-details-inner :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def gender-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :pokemon_species_details) (s/coll-of gender-detail-pokemon-species-details-inner-spec)
   (ds/req :required_for_evolution) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   })

(def gender-detail-spec
  (ds/spec
    {:name ::gender-detail
     :spec gender-detail-data}))
