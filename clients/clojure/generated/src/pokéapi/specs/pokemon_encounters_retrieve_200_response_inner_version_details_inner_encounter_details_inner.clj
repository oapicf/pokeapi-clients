(ns pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-condition-values-inner :refer :all]
            [pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-method :refer :all]
            )
  (:import (java.io File)))


(def pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-data
  {
   (ds/req :chance) float?
   (ds/req :condition_values) (s/coll-of pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-condition-values-inner-spec)
   (ds/req :max_level) float?
   (ds/req :method) pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-method-spec
   (ds/req :min_level) float?
   })

(def pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-spec
  (ds/spec
    {:name ::pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner
     :spec pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-data}))
