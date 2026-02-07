(ns pokéapi.specs.pokemon-species-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.growth-rate-summary :refer :all]
            [pokéapi.specs.pokemon-dex-entry :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.pokemon-color-summary :refer :all]
            [pokéapi.specs.pokemon-shape-summary :refer :all]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            [pokéapi.specs.evolution-chain-summary :refer :all]
            [pokéapi.specs.pokemon-habitat-summary :refer :all]
            [pokéapi.specs.generation-summary :refer :all]
            [pokéapi.specs.pokemon-form-detail-form-names-inner :refer :all]
            [pokéapi.specs.pokemon-species-detail-pal-park-encounters-inner :refer :all]
            [pokéapi.specs.pokemon-species-description :refer :all]
            [pokéapi.specs.pokemon-species-flavor-text :refer :all]
            [pokéapi.specs.pokemon-species-detail-genera-inner :refer :all]
            [pokéapi.specs.pokemon-species-detail-varieties-inner :refer :all]
            )
  (:import (java.io File)))


(def pokemon-species-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/opt :order) int?
   (ds/opt :gender_rate) int?
   (ds/opt :capture_rate) int?
   (ds/opt :base_happiness) int?
   (ds/opt :is_baby) boolean?
   (ds/opt :is_legendary) boolean?
   (ds/opt :is_mythical) boolean?
   (ds/opt :hatch_counter) int?
   (ds/opt :has_gender_differences) boolean?
   (ds/opt :forms_switchable) boolean?
   (ds/req :growth_rate) growth-rate-summary-spec
   (ds/req :pokedex_numbers) (s/coll-of pokemon-dex-entry-spec)
   (ds/req :egg_groups) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :color) pokemon-color-summary-spec
   (ds/req :shape) pokemon-shape-summary-spec
   (ds/req :evolves_from_species) pokemon-species-summary-spec
   (ds/req :evolution_chain) evolution-chain-summary-spec
   (ds/req :habitat) pokemon-habitat-summary-spec
   (ds/req :generation) generation-summary-spec
   (ds/req :names) (s/coll-of pokemon-form-detail-form-names-inner-spec)
   (ds/req :pal_park_encounters) (s/coll-of pokemon-species-detail-pal-park-encounters-inner-spec)
   (ds/req :form_descriptions) (s/coll-of pokemon-species-description-spec)
   (ds/req :flavor_text_entries) (s/coll-of pokemon-species-flavor-text-spec)
   (ds/req :genera) (s/coll-of pokemon-species-detail-genera-inner-spec)
   (ds/req :varieties) (s/coll-of pokemon-species-detail-varieties-inner-spec)
   })

(def pokemon-species-detail-spec
  (ds/spec
    {:name ::pokemon-species-detail
     :spec pokemon-species-detail-data}))
