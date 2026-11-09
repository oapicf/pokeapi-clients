(ns pokéapi.specs.pokemon-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-ability :refer :all]
            [pokéapi.specs.pokemon-past-ability :refer :all]
            [pokéapi.specs.pokemon-form-summary :refer :all]
            [pokéapi.specs.pokemon-game-index :refer :all]
            [pokéapi.specs.pokemon-held-item-summary :refer :all]
            [pokéapi.specs.pokemon-move :refer :all]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            [pokéapi.specs.pokemon-sprites :refer :all]
            [pokéapi.specs.pokemon-cries :refer :all]
            [pokéapi.specs.pokemon-stat :refer :all]
            [pokéapi.specs.pokemon-past-stat :refer :all]
            [pokéapi.specs.pokemon-type :refer :all]
            [pokéapi.specs.pokemon-past-type :refer :all]
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
   (ds/req :abilities) (s/coll-of pokemon-ability-spec)
   (ds/req :past_abilities) (s/coll-of pokemon-past-ability-spec)
   (ds/req :forms) (s/coll-of pokemon-form-summary-spec)
   (ds/req :game_indices) (s/coll-of pokemon-game-index-spec)
   (ds/req :held_items) (s/coll-of pokemon-held-item-summary-spec)
   (ds/req :location_area_encounters) string?
   (ds/req :moves) (s/coll-of pokemon-move-spec)
   (ds/req :species) pokemon-species-summary-spec
   (ds/req :sprites) pokemon-sprites-spec
   (ds/req :cries) pokemon-cries-spec
   (ds/req :stats) (s/coll-of pokemon-stat-spec)
   (ds/req :past_stats) (s/coll-of pokemon-past-stat-spec)
   (ds/req :types) (s/coll-of pokemon-type-spec)
   (ds/req :past_types) (s/coll-of pokemon-past-type-spec)
   })

(def pokemon-detail-spec
  (ds/spec
    {:name ::pokemon-detail
     :spec pokemon-detail-data}))
