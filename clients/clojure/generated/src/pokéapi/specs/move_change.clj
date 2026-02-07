(ns pokéapi.specs.move-change
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-change-effect-entries-inner :refer :all]
            [pokéapi.specs.type-summary :refer :all]
            [pokéapi.specs.version-group-summary :refer :all]
            )
  (:import (java.io File)))


(def move-change-data
  {
   (ds/opt :accuracy) int?
   (ds/opt :power) int?
   (ds/opt :pp) int?
   (ds/req :effect_chance) int?
   (ds/req :effect_entries) (s/coll-of move-change-effect-entries-inner-spec)
   (ds/req :type) type-summary-spec
   (ds/req :version_group) version-group-summary-spec
   })

(def move-change-spec
  (ds/spec
    {:name ::move-change
     :spec move-change-data}))
