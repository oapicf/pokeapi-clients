(ns pokéapi.specs.location-area-pokemon-encounter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-summary :refer :all]
            [pokéapi.specs.location-area-pokemon-encounter-version :refer :all]
            )
  (:import (java.io File)))


(def location-area-pokemon-encounter-data
  {
   (ds/req :pokemon) pokemon-summary-spec
   (ds/req :version_details) (s/coll-of location-area-pokemon-encounter-version-spec)
   })

(def location-area-pokemon-encounter-spec
  (ds/spec
    {:name ::location-area-pokemon-encounter
     :spec location-area-pokemon-encounter-data}))
