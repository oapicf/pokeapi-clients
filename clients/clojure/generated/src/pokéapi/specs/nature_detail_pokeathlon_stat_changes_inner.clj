(ns pokéapi.specs.nature-detail-pokeathlon-stat-changes-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def nature-detail-pokeathlon-stat-changes-inner-data
  {
   (ds/req :max_change) int?
   (ds/req :pokeathlon_stat) ability-detail-pokemon-inner-pokemon-spec
   })

(def nature-detail-pokeathlon-stat-changes-inner-spec
  (ds/spec
    {:name ::nature-detail-pokeathlon-stat-changes-inner
     :spec nature-detail-pokeathlon-stat-changes-inner-data}))
