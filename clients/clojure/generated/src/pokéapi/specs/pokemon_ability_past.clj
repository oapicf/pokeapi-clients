(ns pokéapi.specs.pokemon-ability-past
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-ability-past-data
  {
   (ds/opt :is_hidden) boolean?
   (ds/req :slot) int?
   (ds/req :ability) ability-summary-spec
   })

(def pokemon-ability-past-spec
  (ds/spec
    {:name ::pokemon-ability-past
     :spec pokemon-ability-past-data}))
