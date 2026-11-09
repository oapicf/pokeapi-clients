(ns pokéapi.specs.pokemon-past-ability
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-ability-past :refer :all]
            [pokéapi.specs.generation-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-past-ability-data
  {
   (ds/req :abilities) (s/coll-of pokemon-ability-past-spec)
   (ds/req :generation) generation-summary-spec
   })

(def pokemon-past-ability-spec
  (ds/spec
    {:name ::pokemon-past-ability
     :spec pokemon-past-ability-data}))
