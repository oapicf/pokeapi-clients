(ns pokéapi.specs.type-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.type-relationships :refer :all]
            [pokéapi.specs.type-past-relationships :refer :all]
            [pokéapi.specs.type-game-index :refer :all]
            [pokéapi.specs.generation-summary :refer :all]
            [pokéapi.specs.move-damage-class-summary :refer :all]
            [pokéapi.specs.type-name :refer :all]
            [pokéapi.specs.type-pokemon :refer :all]
            [pokéapi.specs.move-summary :refer :all]
            )
  (:import (java.io File)))


(def type-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :damage_relations) type-relationships-spec
   (ds/req :past_damage_relations) (s/coll-of type-past-relationships-spec)
   (ds/req :game_indices) (s/coll-of type-game-index-spec)
   (ds/req :generation) generation-summary-spec
   (ds/req :move_damage_class) move-damage-class-summary-spec
   (ds/req :names) (s/coll-of type-name-spec)
   (ds/req :pokemon) (s/coll-of type-pokemon-spec)
   (ds/req :moves) (s/coll-of move-summary-spec)
   (ds/req :sprites) (s/map-of string? (s/map-of string? type-game-sprite-spec))
   })

(def type-detail-spec
  (ds/spec
    {:name ::type-detail
     :spec type-detail-data}))
