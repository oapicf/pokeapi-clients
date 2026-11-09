(ns pokéapi.specs.location-area-pokemon-encounter-version
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.version-summary :refer :all]
            [pokéapi.specs.location-area-encounter-detail :refer :all]
            )
  (:import (java.io File)))


(def location-area-pokemon-encounter-version-data
  {
   (ds/req :version) version-summary-spec
   (ds/req :max_chance) int?
   (ds/req :encounter_details) (s/coll-of location-area-encounter-detail-spec)
   })

(def location-area-pokemon-encounter-version-spec
  (ds/spec
    {:name ::location-area-pokemon-encounter-version
     :spec location-area-pokemon-encounter-version-data}))
