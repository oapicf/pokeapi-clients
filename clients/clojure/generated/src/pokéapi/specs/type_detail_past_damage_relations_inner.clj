(ns pokéapi.specs.type-detail-past-damage-relations-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.type-detail-past-damage-relations-inner-damage-relations :refer :all]
            )
  (:import (java.io File)))


(def type-detail-past-damage-relations-inner-data
  {
   (ds/req :generation) ability-detail-pokemon-inner-pokemon-spec
   (ds/req :damage_relations) type-detail-past-damage-relations-inner-damage-relations-spec
   })

(def type-detail-past-damage-relations-inner-spec
  (ds/spec
    {:name ::type-detail-past-damage-relations-inner
     :spec type-detail-past-damage-relations-inner-data}))
