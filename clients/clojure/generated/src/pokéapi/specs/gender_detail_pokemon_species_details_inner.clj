(ns pokéapi.specs.gender-detail-pokemon-species-details-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def gender-detail-pokemon-species-details-inner-data
  {
   (ds/req :rate) int?
   (ds/req :pokemon_species) ability-detail-pokemon-inner-pokemon-spec
   })

(def gender-detail-pokemon-species-details-inner-spec
  (ds/spec
    {:name ::gender-detail-pokemon-species-details-inner
     :spec gender-detail-pokemon-species-details-inner-data}))
