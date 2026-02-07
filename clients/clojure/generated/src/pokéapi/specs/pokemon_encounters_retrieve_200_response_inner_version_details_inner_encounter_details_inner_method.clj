(ns pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-method
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-method-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-method-spec
  (ds/spec
    {:name ::pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-method
     :spec pokemon-encounters-retrieve-200-response-inner-version-details-inner-encounter-details-inner-method-data}))
