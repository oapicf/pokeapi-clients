(ns pokéapi.specs.move-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-detail-contest-combos :refer :all]
            [pokéapi.specs.contest-type-summary :refer :all]
            [pokéapi.specs.contest-effect-summary :refer :all]
            [pokéapi.specs.move-damage-class-summary :refer :all]
            [pokéapi.specs.move-change-effect-entries-inner :refer :all]
            [pokéapi.specs.move-detail-effect-changes-inner :refer :all]
            [pokéapi.specs.generation-summary :refer :all]
            [pokéapi.specs.move-meta :refer :all]
            [pokéapi.specs.move-name :refer :all]
            [pokéapi.specs.move-change :refer :all]
            [pokéapi.specs.move-detail-stat-changes-inner :refer :all]
            [pokéapi.specs.super-contest-effect-summary :refer :all]
            [pokéapi.specs.move-target-summary :refer :all]
            [pokéapi.specs.type-summary :refer :all]
            [pokéapi.specs.move-detail-machines-inner :refer :all]
            [pokéapi.specs.move-flavor-text :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def move-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/opt :accuracy) int?
   (ds/req :effect_chance) int?
   (ds/opt :pp) int?
   (ds/opt :priority) int?
   (ds/opt :power) int?
   (ds/req :contest_combos) move-detail-contest-combos-spec
   (ds/req :contest_type) contest-type-summary-spec
   (ds/req :contest_effect) contest-effect-summary-spec
   (ds/req :damage_class) move-damage-class-summary-spec
   (ds/req :effect_entries) (s/coll-of move-change-effect-entries-inner-spec)
   (ds/req :effect_changes) (s/coll-of move-detail-effect-changes-inner-spec)
   (ds/req :generation) generation-summary-spec
   (ds/req :meta) move-meta-spec
   (ds/req :names) (s/coll-of move-name-spec)
   (ds/req :past_values) (s/coll-of move-change-spec)
   (ds/req :stat_changes) (s/coll-of move-detail-stat-changes-inner-spec)
   (ds/req :super_contest_effect) super-contest-effect-summary-spec
   (ds/req :target) move-target-summary-spec
   (ds/req :type) type-summary-spec
   (ds/req :machines) (s/coll-of move-detail-machines-inner-spec)
   (ds/req :flavor_text_entries) (s/coll-of move-flavor-text-spec)
   (ds/req :learned_by_pokemon) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   })

(def move-detail-spec
  (ds/spec
    {:name ::move-detail
     :spec move-detail-data}))
