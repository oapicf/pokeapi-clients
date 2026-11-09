(ns pokéapi.specs.pokemon-evolution
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.version-group-summary :refer :all]
            [pokéapi.specs.item-summary :refer :all]
            [pokéapi.specs.evolution-trigger-summary :refer :all]
            [pokéapi.specs.item-summary :refer :all]
            [pokéapi.specs.pokemon-evolution-known-move :refer :all]
            [pokéapi.specs.pokemon-evolution-known-move :refer :all]
            [pokéapi.specs.location-summary :refer :all]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            [pokéapi.specs.type-summary :refer :all]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            [pokéapi.specs.region-summary :refer :all]
            [pokéapi.specs.pokemon-form-summary :refer :all]
            [pokéapi.specs.pokemon-form-summary :refer :all]
            [pokéapi.specs.move-summary :refer :all]
            [pokéapi.specs.nature-summary :refer :all]
            [pokéapi.specs.evolution-condition-expression :refer :all]
            )
  (:import (java.io File)))


(def pokemon-evolution-data
  {
   (ds/req :version_group) version-group-summary-spec
   (ds/opt :is_default) boolean?
   (ds/req :item) item-summary-spec
   (ds/req :trigger) evolution-trigger-summary-spec
   (ds/opt :gender) int?
   (ds/req :held_item) item-summary-spec
   (ds/req :known_move) pokemon-evolution-known-move-spec
   (ds/req :known_move_type) pokemon-evolution-known-move-spec
   (ds/req :location) location-summary-spec
   (ds/opt :min_level) int?
   (ds/opt :min_happiness) int?
   (ds/opt :min_beauty) int?
   (ds/opt :min_affection) int?
   (ds/opt :near_special_rock) boolean?
   (ds/opt :needs_multiplayer) boolean?
   (ds/opt :needs_overworld_rain) boolean?
   (ds/req :party_species) pokemon-species-summary-spec
   (ds/req :party_type) type-summary-spec
   (ds/opt :relative_physical_stats) int?
   (ds/opt :time_of_day) string?
   (ds/req :trade_species) pokemon-species-summary-spec
   (ds/opt :turn_upside_down) boolean?
   (ds/req :region) region-summary-spec
   (ds/req :required_pokemon_form) pokemon-form-summary-spec
   (ds/req :evolved_pokemon_form) pokemon-form-summary-spec
   (ds/req :used_move) move-summary-spec
   (ds/opt :min_move_count) int?
   (ds/opt :min_steps) int?
   (ds/opt :min_damage_taken) int?
   (ds/req :allowed_natures) (s/coll-of nature-summary-spec)
   (ds/req :condition_expression) evolution-condition-expression-spec
   })

(def pokemon-evolution-spec
  (ds/spec
    {:name ::pokemon-evolution
     :spec pokemon-evolution-data}))
