(ns pokéapi.specs.pokeathlon-stat-detail-affecting-natures-decrease-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def pokeathlon-stat-detail-affecting-natures-decrease-inner-data
  {
   (ds/req :max_change) int?
   (ds/req :nature) ability-detail-pokemon-inner-pokemon-spec
   })

(def pokeathlon-stat-detail-affecting-natures-decrease-inner-spec
  (ds/spec
    {:name ::pokeathlon-stat-detail-affecting-natures-decrease-inner
     :spec pokeathlon-stat-detail-affecting-natures-decrease-inner-data}))
