(ns pokéapi.specs.stat-detail-affecting-moves-increase-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def stat-detail-affecting-moves-increase-inner-data
  {
   (ds/req :change) int?
   (ds/req :move) ability-detail-pokemon-inner-pokemon-spec
   })

(def stat-detail-affecting-moves-increase-inner-spec
  (ds/spec
    {:name ::stat-detail-affecting-moves-increase-inner
     :spec stat-detail-affecting-moves-increase-inner-data}))
