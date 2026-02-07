(ns pokéapi.specs.type-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.type-detail-damage-relations :refer :all]
            [pokéapi.specs.type-detail-past-damage-relations-inner :refer :all]
            [pokéapi.specs.type-game-index :refer :all]
            [pokéapi.specs.generation-summary :refer :all]
            [pokéapi.specs.move-damage-class-summary :refer :all]
            [pokéapi.specs.ability-name :refer :all]
            [pokéapi.specs.type-detail-pokemon-inner :refer :all]
            [pokéapi.specs.move-summary :refer :all]
            )
  (:import (java.io File)))


(def type-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :damage_relations) type-detail-damage-relations-spec
   (ds/req :past_damage_relations) (s/coll-of type-detail-past-damage-relations-inner-spec)
   (ds/req :game_indices) (s/coll-of type-game-index-spec)
   (ds/req :generation) generation-summary-spec
   (ds/req :move_damage_class) move-damage-class-summary-spec
   (ds/req :names) (s/coll-of ability-name-spec)
   (ds/req :pokemon) (s/coll-of type-detail-pokemon-inner-spec)
   (ds/req :moves) (s/coll-of move-summary-spec)
   (ds/req :sprites) (s/map-of string? (s/map-of string? type-detail-sprites-value-value-spec))
   })

(def type-detail-spec
  (ds/spec
    {:name ::type-detail
     :spec type-detail-data}))
