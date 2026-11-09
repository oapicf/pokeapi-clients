(ns pokéapi.specs.pokemon-move-version-group
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-learn-method-summary :refer :all]
            [pokéapi.specs.version-group-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-move-version-group-data
  {
   (ds/req :level_learned_at) int?
   (ds/req :move_learn_method) move-learn-method-summary-spec
   (ds/req :version_group) version-group-summary-spec
   (ds/opt :order) int?
   })

(def pokemon-move-version-group-spec
  (ds/spec
    {:name ::pokemon-move-version-group
     :spec pokemon-move-version-group-data}))
