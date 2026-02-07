(ns pokéapi.specs.move-detail-effect-changes-inner-effect-entries-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def move-detail-effect-changes-inner-effect-entries-inner-data
  {
   (ds/req :effect) string?
   (ds/req :language) ability-detail-pokemon-inner-pokemon-spec
   })

(def move-detail-effect-changes-inner-effect-entries-inner-spec
  (ds/spec
    {:name ::move-detail-effect-changes-inner-effect-entries-inner
     :spec move-detail-effect-changes-inner-effect-entries-inner-data}))
