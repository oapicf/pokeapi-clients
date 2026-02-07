(ns pokéapi.specs.pokedex-detail-pokemon-entries-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def pokedex-detail-pokemon-entries-inner-data
  {
   (ds/req :entry_number) int?
   (ds/req :pokemon_species) ability-detail-pokemon-inner-pokemon-spec
   })

(def pokedex-detail-pokemon-entries-inner-spec
  (ds/spec
    {:name ::pokedex-detail-pokemon-entries-inner
     :spec pokedex-detail-pokemon-entries-inner-data}))
