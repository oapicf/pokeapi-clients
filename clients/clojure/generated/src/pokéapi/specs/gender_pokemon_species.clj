(ns pokéapi.specs.gender-pokemon-species
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            )
  (:import (java.io File)))


(def gender-pokemon-species-data
  {
   (ds/req :rate) int?
   (ds/req :pokemon_species) pokemon-species-summary-spec
   })

(def gender-pokemon-species-spec
  (ds/spec
    {:name ::gender-pokemon-species
     :spec gender-pokemon-species-data}))
