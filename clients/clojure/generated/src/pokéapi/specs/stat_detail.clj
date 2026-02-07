(ns pokéapi.specs.stat-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.stat-detail-affecting-moves :refer :all]
            [pokéapi.specs.stat-detail-affecting-natures :refer :all]
            [pokéapi.specs.characteristic-summary :refer :all]
            [pokéapi.specs.move-damage-class-summary :refer :all]
            [pokéapi.specs.stat-name :refer :all]
            )
  (:import (java.io File)))


(def stat-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :game_index) int?
   (ds/opt :is_battle_only) boolean?
   (ds/req :affecting_moves) stat-detail-affecting-moves-spec
   (ds/req :affecting_natures) stat-detail-affecting-natures-spec
   (ds/req :characteristics) (s/coll-of characteristic-summary-spec)
   (ds/req :move_damage_class) move-damage-class-summary-spec
   (ds/req :names) (s/coll-of stat-name-spec)
   })

(def stat-detail-spec
  (ds/spec
    {:name ::stat-detail
     :spec stat-detail-data}))
