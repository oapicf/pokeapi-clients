(ns pokéapi.specs.ability-detail-pokemon-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def ability-detail-pokemon-inner-data
  {
   (ds/req :is_hidden) boolean?
   (ds/req :slot) int?
   (ds/req :pokemon) ability-detail-pokemon-inner-pokemon-spec
   })

(def ability-detail-pokemon-inner-spec
  (ds/spec
    {:name ::ability-detail-pokemon-inner
     :spec ability-detail-pokemon-inner-data}))
