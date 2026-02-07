(ns pokéapi.specs.ability-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.generation-summary :refer :all]
            [pokéapi.specs.ability-name :refer :all]
            [pokéapi.specs.ability-effect-text :refer :all]
            [pokéapi.specs.ability-change :refer :all]
            [pokéapi.specs.ability-flavor-text :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner :refer :all]
            )
  (:import (java.io File)))


(def ability-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/opt :is_main_series) boolean?
   (ds/req :generation) generation-summary-spec
   (ds/req :names) (s/coll-of ability-name-spec)
   (ds/req :effect_entries) (s/coll-of ability-effect-text-spec)
   (ds/req :effect_changes) (s/coll-of ability-change-spec)
   (ds/req :flavor_text_entries) (s/coll-of ability-flavor-text-spec)
   (ds/req :pokemon) (s/coll-of ability-detail-pokemon-inner-spec)
   })

(def ability-detail-spec
  (ds/spec
    {:name ::ability-detail
     :spec ability-detail-data}))
