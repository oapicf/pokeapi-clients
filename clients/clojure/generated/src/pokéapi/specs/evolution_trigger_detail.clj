(ns pokéapi.specs.evolution-trigger-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.evolution-trigger-name :refer :all]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            )
  (:import (java.io File)))


(def evolution-trigger-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :names) (s/coll-of evolution-trigger-name-spec)
   (ds/req :pokemon_species) (s/coll-of pokemon-species-summary-spec)
   })

(def evolution-trigger-detail-spec
  (ds/spec
    {:name ::evolution-trigger-detail
     :spec evolution-trigger-detail-data}))
