(ns pokéapi.specs.pokeathlon-stat-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokeathlon-stat-detail-affecting-natures :refer :all]
            [pokéapi.specs.pokeathlon-stat-name :refer :all]
            )
  (:import (java.io File)))


(def pokeathlon-stat-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :affecting_natures) pokeathlon-stat-detail-affecting-natures-spec
   (ds/req :names) (s/coll-of pokeathlon-stat-name-spec)
   })

(def pokeathlon-stat-detail-spec
  (ds/spec
    {:name ::pokeathlon-stat-detail
     :spec pokeathlon-stat-detail-data}))
