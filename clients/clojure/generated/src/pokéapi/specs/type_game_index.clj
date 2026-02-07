(ns pokéapi.specs.type-game-index
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.generation-summary :refer :all]
            )
  (:import (java.io File)))


(def type-game-index-data
  {
   (ds/req :game_index) int?
   (ds/req :generation) generation-summary-spec
   })

(def type-game-index-spec
  (ds/spec
    {:name ::type-game-index
     :spec type-game-index-data}))
