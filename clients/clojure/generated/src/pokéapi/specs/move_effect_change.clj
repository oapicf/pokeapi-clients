(ns pokéapi.specs.move-effect-change
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.version-group-summary :refer :all]
            [pokéapi.specs.move-effect-change-effect-text :refer :all]
            )
  (:import (java.io File)))


(def move-effect-change-data
  {
   (ds/req :version_group) version-group-summary-spec
   (ds/req :effect_entries) (s/coll-of move-effect-change-effect-text-spec)
   })

(def move-effect-change-spec
  (ds/spec
    {:name ::move-effect-change
     :spec move-effect-change-data}))
