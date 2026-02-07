(ns pokéapi.specs.item-game-index
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.generation-summary :refer :all]
            )
  (:import (java.io File)))


(def item-game-index-data
  {
   (ds/req :game_index) int?
   (ds/req :generation) generation-summary-spec
   })

(def item-game-index-spec
  (ds/spec
    {:name ::item-game-index
     :spec item-game-index-data}))
