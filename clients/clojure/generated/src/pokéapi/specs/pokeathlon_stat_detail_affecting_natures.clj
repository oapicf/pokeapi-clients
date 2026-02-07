(ns pokéapi.specs.pokeathlon-stat-detail-affecting-natures
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokeathlon-stat-detail-affecting-natures-decrease-inner :refer :all]
            [pokéapi.specs.pokeathlon-stat-detail-affecting-natures-increase-inner :refer :all]
            )
  (:import (java.io File)))


(def pokeathlon-stat-detail-affecting-natures-data
  {
   (ds/req :decrease) (s/coll-of pokeathlon-stat-detail-affecting-natures-decrease-inner-spec)
   (ds/req :increase) (s/coll-of pokeathlon-stat-detail-affecting-natures-increase-inner-spec)
   })

(def pokeathlon-stat-detail-affecting-natures-spec
  (ds/spec
    {:name ::pokeathlon-stat-detail-affecting-natures
     :spec pokeathlon-stat-detail-affecting-natures-data}))
