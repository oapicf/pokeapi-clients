(ns pokéapi.specs.pokemon-ability
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-ability-data
  {
   (ds/opt :is_hidden) boolean?
   (ds/req :slot) int?
   (ds/req :ability) ability-summary-spec
   })

(def pokemon-ability-spec
  (ds/spec
    {:name ::pokemon-ability
     :spec pokemon-ability-data}))
