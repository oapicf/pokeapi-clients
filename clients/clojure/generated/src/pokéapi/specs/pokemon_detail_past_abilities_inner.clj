(ns pokéapi.specs.pokemon-detail-past-abilities-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-detail-abilities-inner :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def pokemon-detail-past-abilities-inner-data
  {
   (ds/req :abilities) (s/coll-of pokemon-detail-abilities-inner-spec)
   (ds/req :generation) ability-detail-pokemon-inner-pokemon-spec
   })

(def pokemon-detail-past-abilities-inner-spec
  (ds/spec
    {:name ::pokemon-detail-past-abilities-inner
     :spec pokemon-detail-past-abilities-inner-data}))
