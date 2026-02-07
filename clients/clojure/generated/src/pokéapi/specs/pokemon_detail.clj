(ns pokéapi.specs.pokemon-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-detail-abilities-inner :refer :all]
            [pokéapi.specs.pokemon-detail-past-abilities-inner :refer :all]
            [pokéapi.specs.pokemon-form-summary :refer :all]
            [pokéapi.specs.pokemon-game-index :refer :all]
            [pokéapi.specs.pokemon-detail-held-items :refer :all]
            [pokéapi.specs.pokemon-detail-moves-inner :refer :all]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            [pokéapi.specs.pokemon-detail-sprites :refer :all]
            [pokéapi.specs.pokemon-detail-cries :refer :all]
            [pokéapi.specs.pokemon-stat :refer :all]
            [pokéapi.specs.pokemon-detail-types-inner :refer :all]
            [pokéapi.specs.pokemon-detail-past-types-inner :refer :all]
            )
  (:import (java.io File)))


(def pokemon-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/opt :base_experience) int?
   (ds/opt :height) int?
   (ds/opt :is_default) boolean?
   (ds/opt :order) int?
   (ds/opt :weight) int?
   (ds/req :abilities) (s/coll-of pokemon-detail-abilities-inner-spec)
   (ds/req :past_abilities) (s/coll-of pokemon-detail-past-abilities-inner-spec)
   (ds/req :forms) (s/coll-of pokemon-form-summary-spec)
   (ds/req :game_indices) (s/coll-of pokemon-game-index-spec)
   (ds/req :held_items) pokemon-detail-held-items-spec
   (ds/req :location_area_encounters) string?
   (ds/req :moves) (s/coll-of pokemon-detail-moves-inner-spec)
   (ds/req :species) pokemon-species-summary-spec
   (ds/req :sprites) pokemon-detail-sprites-spec
   (ds/req :cries) pokemon-detail-cries-spec
   (ds/req :stats) (s/coll-of pokemon-stat-spec)
   (ds/req :types) (s/coll-of pokemon-detail-types-inner-spec)
   (ds/req :past_types) (s/coll-of pokemon-detail-past-types-inner-spec)
   })

(def pokemon-detail-spec
  (ds/spec
    {:name ::pokemon-detail
     :spec pokemon-detail-data}))
