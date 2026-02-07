(ns pokéapi.specs.pokemon-detail-moves-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.pokemon-detail-moves-inner-version-group-details-inner :refer :all]
            )
  (:import (java.io File)))


(def pokemon-detail-moves-inner-data
  {
   (ds/req :move) ability-detail-pokemon-inner-pokemon-spec
   (ds/req :version_group_details) (s/coll-of pokemon-detail-moves-inner-version-group-details-inner-spec)
   })

(def pokemon-detail-moves-inner-spec
  (ds/spec
    {:name ::pokemon-detail-moves-inner
     :spec pokemon-detail-moves-inner-data}))
