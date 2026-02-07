(ns pokéapi.specs.egg-group-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.egg-group-name :refer :all]
            [pokéapi.specs.egg-group-detail-pokemon-species-inner :refer :all]
            )
  (:import (java.io File)))


(def egg-group-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :names) (s/coll-of egg-group-name-spec)
   (ds/req :pokemon_species) (s/coll-of egg-group-detail-pokemon-species-inner-spec)
   })

(def egg-group-detail-spec
  (ds/spec
    {:name ::egg-group-detail
     :spec egg-group-detail-data}))
