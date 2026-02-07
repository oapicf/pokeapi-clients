(ns pokéapi.specs.evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-gender :refer :all]
            [pokéapi.specs.evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-gender :refer :all]
            [pokéapi.specs.evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-gender :refer :all]
            [pokéapi.specs. :refer :all]
            [pokéapi.specs. :refer :all]
            [pokéapi.specs.evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-gender :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-data
  {
   (ds/req :gender) evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-gender-spec
   (ds/req :held_item) evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-gender-spec
   (ds/req :item) evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-gender-spec
   (ds/req :known_move) any?
   (ds/req :known_move_type) any?
   (ds/req :location) evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-gender-spec
   (ds/req :min_affection) int?
   (ds/req :min_beauty) int?
   (ds/req :min_happiness) int?
   (ds/req :min_level) int?
   (ds/req :needs_overworld_rain) boolean?
   (ds/req :party_species) string?
   (ds/req :party_type) string?
   (ds/req :relative_physical_stats) string?
   (ds/req :time_of_day) string?
   (ds/req :trade_species) string?
   (ds/req :trigger) ability-detail-pokemon-inner-pokemon-spec
   (ds/req :turn_upside_down) boolean?
   })

(def evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-spec
  (ds/spec
    {:name ::evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner
     :spec evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-data}))
