(ns pokéapi.specs.pokemon-detail-abilities-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def pokemon-detail-abilities-inner-data
  {
   (ds/req :ability) ability-detail-pokemon-inner-pokemon-spec
   (ds/req :is_hidden) boolean?
   (ds/req :slot) int?
   })

(def pokemon-detail-abilities-inner-spec
  (ds/spec
    {:name ::pokemon-detail-abilities-inner
     :spec pokemon-detail-abilities-inner-data}))
