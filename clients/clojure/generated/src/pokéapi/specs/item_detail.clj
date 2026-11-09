(ns pokéapi.specs.item-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.item-fling-effect-summary :refer :all]
            [pokéapi.specs.item-attribute-summary :refer :all]
            [pokéapi.specs.item-category-summary :refer :all]
            [pokéapi.specs.item-effect-text :refer :all]
            [pokéapi.specs.item-flavor-text :refer :all]
            [pokéapi.specs.item-game-index :refer :all]
            [pokéapi.specs.item-price :refer :all]
            [pokéapi.specs.item-name :refer :all]
            [pokéapi.specs.pokemon-held-item :refer :all]
            [pokéapi.specs.item-sprites :refer :all]
            [pokéapi.specs.evolution-chain-summary :refer :all]
            [pokéapi.specs.item-machine :refer :all]
            )
  (:import (java.io File)))


(def item-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/opt :fling_power) int?
   (ds/req :fling_effect) item-fling-effect-summary-spec
   (ds/req :attributes) (s/coll-of item-attribute-summary-spec)
   (ds/req :category) item-category-summary-spec
   (ds/req :effect_entries) (s/coll-of item-effect-text-spec)
   (ds/req :flavor_text_entries) (s/coll-of item-flavor-text-spec)
   (ds/req :game_indices) (s/coll-of item-game-index-spec)
   (ds/req :prices) (s/coll-of item-price-spec)
   (ds/req :names) (s/coll-of item-name-spec)
   (ds/req :held_by_pokemon) (s/coll-of pokemon-held-item-spec)
   (ds/req :sprites) item-sprites-spec
   (ds/req :baby_trigger_for) evolution-chain-summary-spec
   (ds/req :machines) (s/coll-of item-machine-spec)
   })

(def item-detail-spec
  (ds/spec
    {:name ::item-detail
     :spec item-detail-data}))
