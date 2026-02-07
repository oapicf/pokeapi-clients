(ns pokéapi.specs.move-detail-effect-changes-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-detail-effect-changes-inner-effect-entries-inner :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def move-detail-effect-changes-inner-data
  {
   (ds/req :effect_entries) (s/coll-of move-detail-effect-changes-inner-effect-entries-inner-spec)
   (ds/req :version_group) ability-detail-pokemon-inner-pokemon-spec
   })

(def move-detail-effect-changes-inner-spec
  (ds/spec
    {:name ::move-detail-effect-changes-inner
     :spec move-detail-effect-changes-inner-data}))
