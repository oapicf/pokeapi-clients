(ns pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-condition-values-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-condition-values-inner-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-condition-values-inner-spec
  (ds/spec
    {:name ::pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-condition-values-inner
     :spec pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-condition-values-inner-data}))
