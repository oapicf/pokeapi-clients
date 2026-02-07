(ns pokéapi.specs.type-detail-damage-relations
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


(def type-detail-damage-relations-data
  {
   (ds/req :no_damage_to) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :half_damage_to) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :double_damage_to) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :no_damage_from) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :half_damage_from) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :double_damage_from) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   })

(def type-detail-damage-relations-spec
  (ds/spec
    {:name ::type-detail-damage-relations
     :spec type-detail-damage-relations-data}))
