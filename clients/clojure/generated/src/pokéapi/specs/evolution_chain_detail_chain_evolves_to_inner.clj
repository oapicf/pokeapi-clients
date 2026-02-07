(ns pokéapi.specs.evolution-chain-detail-chain-evolves-to-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def evolution-chain-detail-chain-evolves-to-inner-data
  {
   (ds/req :evolution_details) (s/coll-of evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-spec)
   (ds/req :is_baby) boolean?
   (ds/req :species) ability-detail-pokemon-inner-pokemon-spec
   })

(def evolution-chain-detail-chain-evolves-to-inner-spec
  (ds/spec
    {:name ::evolution-chain-detail-chain-evolves-to-inner
     :spec evolution-chain-detail-chain-evolves-to-inner-data}))
