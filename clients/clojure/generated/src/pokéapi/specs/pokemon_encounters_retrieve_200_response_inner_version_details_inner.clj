(ns pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-version-details-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner :refer :all]
            [pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-version-details-inner-version :refer :all]
            )
  (:import (java.io File)))


(def pokemon-encounters-retrieve-200-response-inner-version-details-inner-data
  {
   (ds/req :encounter_details) (s/coll-of pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-spec)
   (ds/req :max_chance) float?
   (ds/req :version) pokemon-encounters-retrieve-200-response-inner-version-details-inner-version-spec
   })

(def pokemon-encounters-retrieve-200-response-inner-version-details-inner-spec
  (ds/spec
    {:name ::pokemon-encounters-retrieve-200-response-inner-version-details-inner
     :spec pokemon-encounters-retrieve-200-response-inner-version-details-inner-data}))
