(ns pokéapi.specs.pokeathlon-stat-affecting-natures
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokeathlon-stat-affecting-nature :refer :all]
            [pokéapi.specs.pokeathlon-stat-affecting-nature :refer :all]
            )
  (:import (java.io File)))


(def pokeathlon-stat-affecting-natures-data
  {
   (ds/req :increase) (s/coll-of pokeathlon-stat-affecting-nature-spec)
   (ds/req :decrease) (s/coll-of pokeathlon-stat-affecting-nature-spec)
   })

(def pokeathlon-stat-affecting-natures-spec
  (ds/spec
    {:name ::pokeathlon-stat-affecting-natures
     :spec pokeathlon-stat-affecting-natures-data}))
