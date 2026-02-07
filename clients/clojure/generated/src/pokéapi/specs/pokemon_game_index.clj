(ns pokéapi.specs.pokemon-game-index
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.version-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-game-index-data
  {
   (ds/req :game_index) int?
   (ds/req :version) version-summary-spec
   })

(def pokemon-game-index-spec
  (ds/spec
    {:name ::pokemon-game-index
     :spec pokemon-game-index-data}))
