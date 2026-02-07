(ns pokéapi.specs.pokeathlon-stat-detail-affecting-natures-increase-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def pokeathlon-stat-detail-affecting-natures-increase-inner-data
  {
   (ds/req :max_change) int?
   (ds/req :nature) ability-detail-pokemon-inner-pokemon-spec
   })

(def pokeathlon-stat-detail-affecting-natures-increase-inner-spec
  (ds/spec
    {:name ::pokeathlon-stat-detail-affecting-natures-increase-inner
     :spec pokeathlon-stat-detail-affecting-natures-increase-inner-data}))
