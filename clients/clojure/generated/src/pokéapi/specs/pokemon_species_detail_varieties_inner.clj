(ns pokéapi.specs.pokemon-species-detail-varieties-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def pokemon-species-detail-varieties-inner-data
  {
   (ds/req :is_default) boolean?
   (ds/req :pokemon) ability-detail-pokemon-inner-pokemon-spec
   })

(def pokemon-species-detail-varieties-inner-spec
  (ds/spec
    {:name ::pokemon-species-detail-varieties-inner
     :spec pokemon-species-detail-varieties-inner-data}))
