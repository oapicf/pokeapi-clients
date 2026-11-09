(ns pokéapi.specs.pokeathlon-stat-affecting-nature
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.nature-summary :refer :all]
            )
  (:import (java.io File)))


(def pokeathlon-stat-affecting-nature-data
  {
   (ds/req :max_change) int?
   (ds/req :nature) nature-summary-spec
   })

(def pokeathlon-stat-affecting-nature-spec
  (ds/spec
    {:name ::pokeathlon-stat-affecting-nature
     :spec pokeathlon-stat-affecting-nature-data}))
