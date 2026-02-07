(ns pokéapi.specs.version-group-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.generation-summary :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.version-summary :refer :all]
            )
  (:import (java.io File)))


(def version-group-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/opt :order) int?
   (ds/req :generation) generation-summary-spec
   (ds/req :move_learn_methods) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :pokedexes) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :regions) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :versions) (s/coll-of version-summary-spec)
   })

(def version-group-detail-spec
  (ds/spec
    {:name ::version-group-detail
     :spec version-group-detail-data}))
