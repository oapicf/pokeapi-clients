(ns pokéapi.specs.pokemon-color-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-color-name :refer :all]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-color-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :names) (s/coll-of pokemon-color-name-spec)
   (ds/req :pokemon_species) (s/coll-of pokemon-species-summary-spec)
   })

(def pokemon-color-detail-spec
  (ds/spec
    {:name ::pokemon-color-detail
     :spec pokemon-color-detail-data}))
