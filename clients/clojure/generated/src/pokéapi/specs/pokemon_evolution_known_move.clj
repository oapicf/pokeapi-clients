(ns pokéapi.specs.pokemon-evolution-known-move
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-evolution-known-move-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def pokemon-evolution-known-move-spec
  (ds/spec
    {:name ::pokemon-evolution-known-move
     :spec pokemon-evolution-known-move-data}))
