(ns pokéapi.specs.pokeathlon-stat-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokeathlon-stat-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def pokeathlon-stat-summary-spec
  (ds/spec
    {:name ::pokeathlon-stat-summary
     :spec pokeathlon-stat-summary-data}))
