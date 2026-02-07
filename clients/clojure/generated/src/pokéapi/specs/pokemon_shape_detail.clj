(ns pokéapi.specs.pokemon-shape-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-shape-detail-awesome-names-inner :refer :all]
            [pokéapi.specs.pokemon-shape-detail-names-inner :refer :all]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-shape-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :awesome_names) (s/coll-of pokemon-shape-detail-awesome-names-inner-spec)
   (ds/req :names) (s/coll-of pokemon-shape-detail-names-inner-spec)
   (ds/req :pokemon_species) (s/coll-of pokemon-species-summary-spec)
   })

(def pokemon-shape-detail-spec
  (ds/spec
    {:name ::pokemon-shape-detail
     :spec pokemon-shape-detail-data}))
