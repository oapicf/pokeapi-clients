(ns pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-version-details-inner-version
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-encounters-retrieve-200-response-inner-version-details-inner-version-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def pokemon-encounters-retrieve-200-response-inner-version-details-inner-version-spec
  (ds/spec
    {:name ::pokemon-encounters-retrieve-200-response-inner-version-details-inner-version
     :spec pokemon-encounters-retrieve-200-response-inner-version-details-inner-version-data}))
