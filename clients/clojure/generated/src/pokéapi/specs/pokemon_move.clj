(ns pokéapi.specs.pokemon-move
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-summary :refer :all]
            [pokéapi.specs.pokemon-move-version-group :refer :all]
            )
  (:import (java.io File)))


(def pokemon-move-data
  {
   (ds/req :move) move-summary-spec
   (ds/req :version_group_details) (s/coll-of pokemon-move-version-group-spec)
   })

(def pokemon-move-spec
  (ds/spec
    {:name ::pokemon-move
     :spec pokemon-move-data}))
