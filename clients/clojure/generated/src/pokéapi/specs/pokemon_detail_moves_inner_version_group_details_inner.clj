(ns pokéapi.specs.pokemon-detail-moves-inner-version-group-details-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def pokemon-detail-moves-inner-version-group-details-inner-data
  {
   (ds/req :level_learned_at) int?
   (ds/req :move_learn_method) ability-detail-pokemon-inner-pokemon-spec
   (ds/req :version_group) ability-detail-pokemon-inner-pokemon-spec
   })

(def pokemon-detail-moves-inner-version-group-details-inner-spec
  (ds/spec
    {:name ::pokemon-detail-moves-inner-version-group-details-inner
     :spec pokemon-detail-moves-inner-version-group-details-inner-data}))
