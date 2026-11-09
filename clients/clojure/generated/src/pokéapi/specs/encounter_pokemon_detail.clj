(ns pokéapi.specs.encounter-pokemon-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def encounter-pokemon-detail-data
  {
   (ds/opt :min_perfect_ivs) int?
   (ds/opt :always_shiny) boolean?
   (ds/opt :never_shiny) boolean?
   (ds/opt :is_alpha) boolean?
   })

(def encounter-pokemon-detail-spec
  (ds/spec
    {:name ::encounter-pokemon-detail
     :spec encounter-pokemon-detail-data}))
