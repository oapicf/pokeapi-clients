(ns pokéapi.specs.item-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.item-fling-effect-summary :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.item-category-summary :refer :all]
            [pokéapi.specs.item-effect-text :refer :all]
            [pokéapi.specs.item-flavor-text :refer :all]
            [pokéapi.specs.item-game-index :refer :all]
            [pokéapi.specs.item-name :refer :all]
            [pokéapi.specs.item-detail-held-by-pokemon-inner :refer :all]
            [pokéapi.specs.item-detail-sprites :refer :all]
            [pokéapi.specs.item-detail-baby-trigger-for :refer :all]
            [pokéapi.specs.item-detail-machines-inner :refer :all]
            )
  (:import (java.io File)))


(def item-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/opt :cost) int?
   (ds/opt :fling_power) int?
   (ds/req :fling_effect) item-fling-effect-summary-spec
   (ds/req :attributes) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :category) item-category-summary-spec
   (ds/req :effect_entries) (s/coll-of item-effect-text-spec)
   (ds/req :flavor_text_entries) (s/coll-of item-flavor-text-spec)
   (ds/req :game_indices) (s/coll-of item-game-index-spec)
   (ds/req :names) (s/coll-of item-name-spec)
   (ds/req :held_by_pokemon) (s/coll-of item-detail-held-by-pokemon-inner-spec)
   (ds/req :sprites) item-detail-sprites-spec
   (ds/req :baby_trigger_for) item-detail-baby-trigger-for-spec
   (ds/req :machines) (s/coll-of item-detail-machines-inner-spec)
   })

(def item-detail-spec
  (ds/spec
    {:name ::item-detail
     :spec item-detail-data}))
