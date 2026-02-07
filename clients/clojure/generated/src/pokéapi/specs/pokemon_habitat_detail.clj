(ns pokéapi.specs.pokemon-habitat-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-habitat-name :refer :all]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-habitat-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :names) (s/coll-of pokemon-habitat-name-spec)
   (ds/req :pokemon_species) (s/coll-of pokemon-species-summary-spec)
   })

(def pokemon-habitat-detail-spec
  (ds/spec
    {:name ::pokemon-habitat-detail
     :spec pokemon-habitat-detail-data}))
