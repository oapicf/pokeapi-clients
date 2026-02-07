(ns pokéapi.specs.type-detail-past-damage-relations-inner-damage-relations
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def type-detail-past-damage-relations-inner-damage-relations-data
  {
   (ds/req :no_damage_to) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :half_damage_to) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :double_damage_to) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :no_damage_from) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :half_damage_from) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :double_damage_from) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   })

(def type-detail-past-damage-relations-inner-damage-relations-spec
  (ds/spec
    {:name ::type-detail-past-damage-relations-inner-damage-relations
     :spec type-detail-past-damage-relations-inner-damage-relations-data}))
