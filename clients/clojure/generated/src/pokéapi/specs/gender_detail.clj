(ns pokéapi.specs.gender-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.gender-pokemon-species :refer :all]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            )
  (:import (java.io File)))


(def gender-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :pokemon_species_details) (s/coll-of gender-pokemon-species-spec)
   (ds/req :required_for_evolution) (s/coll-of pokemon-species-summary-spec)
   })

(def gender-detail-spec
  (ds/spec
    {:name ::gender-detail
     :spec gender-detail-data}))
