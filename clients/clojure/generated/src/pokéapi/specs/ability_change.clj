(ns pokéapi.specs.ability-change
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.version-group-summary :refer :all]
            [pokéapi.specs.ability-change-effect-text :refer :all]
            )
  (:import (java.io File)))


(def ability-change-data
  {
   (ds/req :version_group) version-group-summary-spec
   (ds/req :effect_entries) (s/coll-of ability-change-effect-text-spec)
   })

(def ability-change-spec
  (ds/spec
    {:name ::ability-change
     :spec ability-change-data}))
