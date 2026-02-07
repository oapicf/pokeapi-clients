(ns pokéapi.specs.move-detail-stat-changes-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def move-detail-stat-changes-inner-data
  {
   (ds/req :change) int?
   (ds/req :stat) ability-detail-pokemon-inner-pokemon-spec
   })

(def move-detail-stat-changes-inner-spec
  (ds/spec
    {:name ::move-detail-stat-changes-inner
     :spec move-detail-stat-changes-inner-data}))
