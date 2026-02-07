(ns pokéapi.specs.growth-rate-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.growth-rate-description :refer :all]
            [pokéapi.specs.experience :refer :all]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            )
  (:import (java.io File)))


(def growth-rate-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :formula) string?
   (ds/req :descriptions) (s/coll-of growth-rate-description-spec)
   (ds/req :levels) (s/coll-of experience-spec)
   (ds/req :pokemon_species) (s/coll-of pokemon-species-summary-spec)
   })

(def growth-rate-detail-spec
  (ds/spec
    {:name ::growth-rate-detail
     :spec growth-rate-detail-data}))
