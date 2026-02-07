(ns pokéapi.specs.region-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.location-summary :refer :all]
            [pokéapi.specs.generation-summary :refer :all]
            [pokéapi.specs.region-name :refer :all]
            [pokéapi.specs.pokedex-summary :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def region-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :locations) (s/coll-of location-summary-spec)
   (ds/req :main_generation) generation-summary-spec
   (ds/req :names) (s/coll-of region-name-spec)
   (ds/req :pokedexes) (s/coll-of pokedex-summary-spec)
   (ds/req :version_groups) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   })

(def region-detail-spec
  (ds/spec
    {:name ::region-detail
     :spec region-detail-data}))
