(ns pokéapi.specs.pokemon-species-detail-genera-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def pokemon-species-detail-genera-inner-data
  {
   (ds/req :genus) string?
   (ds/req :language) ability-detail-pokemon-inner-pokemon-spec
   })

(def pokemon-species-detail-genera-inner-spec
  (ds/spec
    {:name ::pokemon-species-detail-genera-inner
     :spec pokemon-species-detail-genera-inner-data}))
