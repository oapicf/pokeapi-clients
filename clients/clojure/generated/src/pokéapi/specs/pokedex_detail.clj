(ns pokéapi.specs.pokedex-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokedex-description :refer :all]
            [pokéapi.specs.pokedex-name :refer :all]
            [pokéapi.specs.pokemon-dex-number :refer :all]
            [pokéapi.specs.region-summary :refer :all]
            [pokéapi.specs.version-group-summary :refer :all]
            )
  (:import (java.io File)))


(def pokedex-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/opt :is_main_series) boolean?
   (ds/req :descriptions) (s/coll-of pokedex-description-spec)
   (ds/req :names) (s/coll-of pokedex-name-spec)
   (ds/req :pokemon_entries) (s/coll-of pokemon-dex-number-spec)
   (ds/req :region) region-summary-spec
   (ds/req :version_groups) (s/coll-of version-group-summary-spec)
   })

(def pokedex-detail-spec
  (ds/spec
    {:name ::pokedex-detail
     :spec pokedex-detail-data}))
