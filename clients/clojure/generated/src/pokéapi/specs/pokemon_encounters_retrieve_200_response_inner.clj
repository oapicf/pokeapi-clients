(ns pokéapi.specs.pokemon-encounters-retrieve-200-response-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-location-area :refer :all]
            [pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-version-details-inner :refer :all]
            )
  (:import (java.io File)))


(def pokemon-encounters-retrieve-200-response-inner-data
  {
   (ds/req :location_area) pokemon-encounters-retrieve-200-response-inner-location-area-spec
   (ds/req :version_details) (s/coll-of pokemon-encounters-retrieve-200-response-inner-version-details-inner-spec)
   })

(def pokemon-encounters-retrieve-200-response-inner-spec
  (ds/spec
    {:name ::pokemon-encounters-retrieve-200-response-inner
     :spec pokemon-encounters-retrieve-200-response-inner-data}))
