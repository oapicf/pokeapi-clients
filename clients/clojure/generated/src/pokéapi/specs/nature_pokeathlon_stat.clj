(ns pokéapi.specs.nature-pokeathlon-stat
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokeathlon-stat-summary :refer :all]
            )
  (:import (java.io File)))


(def nature-pokeathlon-stat-data
  {
   (ds/req :max_change) int?
   (ds/req :pokeathlon_stat) pokeathlon-stat-summary-spec
   })

(def nature-pokeathlon-stat-spec
  (ds/spec
    {:name ::nature-pokeathlon-stat
     :spec nature-pokeathlon-stat-data}))
