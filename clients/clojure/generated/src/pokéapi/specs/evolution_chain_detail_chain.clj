(ns pokéapi.specs.evolution-chain-detail-chain
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.any-type :refer :all]
            [pokéapi.specs.evolution-chain-detail-chain-evolves-to-inner :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def evolution-chain-detail-chain-data
  {
   (ds/req :evolution_details) (s/coll-of any-type-spec)
   (ds/req :evolves_to) (s/coll-of evolution-chain-detail-chain-evolves-to-inner-spec)
   (ds/req :is_baby) boolean?
   (ds/req :species) ability-detail-pokemon-inner-pokemon-spec
   })

(def evolution-chain-detail-chain-spec
  (ds/spec
    {:name ::evolution-chain-detail-chain
     :spec evolution-chain-detail-chain-data}))
