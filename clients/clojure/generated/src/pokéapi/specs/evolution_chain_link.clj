(ns pokéapi.specs.evolution-chain-link
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            [pokéapi.specs.pokemon-evolution :refer :all]
            [pokéapi.specs.evolution-chain-link :refer :all]
            )
  (:import (java.io File)))


(def evolution-chain-link-data
  {
   (ds/req :is_baby) boolean?
   (ds/req :species) pokemon-species-summary-spec
   (ds/req :evolution_details) (s/coll-of pokemon-evolution-spec)
   (ds/req :evolves_to) (s/coll-of evolution-chain-link-spec)
   })

(def evolution-chain-link-spec
  (ds/spec
    {:name ::evolution-chain-link
     :spec evolution-chain-link-data}))
