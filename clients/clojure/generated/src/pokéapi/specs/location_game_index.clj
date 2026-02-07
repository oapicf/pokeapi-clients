(ns pokéapi.specs.location-game-index
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.generation-summary :refer :all]
            )
  (:import (java.io File)))


(def location-game-index-data
  {
   (ds/req :game_index) int?
   (ds/req :generation) generation-summary-spec
   })

(def location-game-index-spec
  (ds/spec
    {:name ::location-game-index
     :spec location-game-index-data}))
