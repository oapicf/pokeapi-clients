(ns pokéapi.specs.pokemon-detail-past-types-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.pokemon-detail-types-inner :refer :all]
            )
  (:import (java.io File)))


(def pokemon-detail-past-types-inner-data
  {
   (ds/req :generation) ability-detail-pokemon-inner-pokemon-spec
   (ds/req :types) (s/coll-of pokemon-detail-types-inner-spec)
   })

(def pokemon-detail-past-types-inner-spec
  (ds/spec
    {:name ::pokemon-detail-past-types-inner
     :spec pokemon-detail-past-types-inner-data}))
