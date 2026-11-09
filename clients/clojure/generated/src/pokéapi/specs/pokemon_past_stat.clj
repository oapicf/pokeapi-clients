(ns pokéapi.specs.pokemon-past-stat
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.generation-summary :refer :all]
            [pokéapi.specs.pokemon-stat :refer :all]
            )
  (:import (java.io File)))


(def pokemon-past-stat-data
  {
   (ds/req :generation) generation-summary-spec
   (ds/req :stats) (s/coll-of pokemon-stat-spec)
   })

(def pokemon-past-stat-spec
  (ds/spec
    {:name ::pokemon-past-stat
     :spec pokemon-past-stat-data}))
