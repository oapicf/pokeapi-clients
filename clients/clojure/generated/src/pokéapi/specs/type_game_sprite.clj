(ns pokéapi.specs.type-game-sprite
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def type-game-sprite-data
  {
   (ds/opt :name_icon) string?
   (ds/opt :symbol_icon) string?
   })

(def type-game-sprite-spec
  (ds/spec
    {:name ::type-game-sprite
     :spec type-game-sprite-data}))
