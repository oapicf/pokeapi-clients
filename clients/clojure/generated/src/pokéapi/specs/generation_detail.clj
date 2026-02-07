(ns pokéapi.specs.generation-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-summary :refer :all]
            [pokéapi.specs.region-summary :refer :all]
            [pokéapi.specs.move-summary :refer :all]
            [pokéapi.specs.generation-name :refer :all]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            [pokéapi.specs.type-summary :refer :all]
            [pokéapi.specs.version-group-summary :refer :all]
            )
  (:import (java.io File)))


(def generation-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :abilities) (s/coll-of ability-summary-spec)
   (ds/req :main_region) region-summary-spec
   (ds/req :moves) (s/coll-of move-summary-spec)
   (ds/req :names) (s/coll-of generation-name-spec)
   (ds/req :pokemon_species) (s/coll-of pokemon-species-summary-spec)
   (ds/req :types) (s/coll-of type-summary-spec)
   (ds/req :version_groups) (s/coll-of version-group-summary-spec)
   })

(def generation-detail-spec
  (ds/spec
    {:name ::generation-detail
     :spec generation-detail-data}))
