(ns pokéapi.specs.pokemon-past-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.generation-summary :refer :all]
            [pokéapi.specs.pokemon-type :refer :all]
            )
  (:import (java.io File)))


(def pokemon-past-type-data
  {
   (ds/req :generation) generation-summary-spec
   (ds/req :types) (s/coll-of pokemon-type-spec)
   })

(def pokemon-past-type-spec
  (ds/spec
    {:name ::pokemon-past-type
     :spec pokemon-past-type-data}))
