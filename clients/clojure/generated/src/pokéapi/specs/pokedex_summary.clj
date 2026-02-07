(ns pokéapi.specs.pokedex-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokedex-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def pokedex-summary-spec
  (ds/spec
    {:name ::pokedex-summary
     :spec pokedex-summary-data}))
