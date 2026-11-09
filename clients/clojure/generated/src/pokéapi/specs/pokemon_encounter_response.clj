(ns pokéapi.specs.pokemon-encounter-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.location-area-summary :refer :all]
            [pokéapi.specs.pokemon-encounter-version-detail-response :refer :all]
            )
  (:import (java.io File)))


(def pokemon-encounter-response-data
  {
   (ds/req :location_area) location-area-summary-spec
   (ds/req :version_details) (s/coll-of pokemon-encounter-version-detail-response-spec)
   })

(def pokemon-encounter-response-spec
  (ds/spec
    {:name ::pokemon-encounter-response
     :spec pokemon-encounter-response-data}))
