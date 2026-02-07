(ns pokéapi.specs.move-change-effect-entries-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def move-change-effect-entries-inner-data
  {
   (ds/req :effect) string?
   (ds/req :short_effect) string?
   (ds/req :language) ability-detail-pokemon-inner-pokemon-spec
   })

(def move-change-effect-entries-inner-spec
  (ds/spec
    {:name ::move-change-effect-entries-inner
     :spec move-change-effect-entries-inner-data}))
