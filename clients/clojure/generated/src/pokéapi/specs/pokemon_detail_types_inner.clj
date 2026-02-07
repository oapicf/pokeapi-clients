(ns pokéapi.specs.pokemon-detail-types-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def pokemon-detail-types-inner-data
  {
   (ds/req :slot) int?
   (ds/req :type) ability-detail-pokemon-inner-pokemon-spec
   })

(def pokemon-detail-types-inner-spec
  (ds/spec
    {:name ::pokemon-detail-types-inner
     :spec pokemon-detail-types-inner-data}))
