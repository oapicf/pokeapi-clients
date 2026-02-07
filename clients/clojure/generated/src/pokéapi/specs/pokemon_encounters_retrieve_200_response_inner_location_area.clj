(ns pokéapi.specs.pokemon-encounters-retrieve-200-response-inner-location-area
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-encounters-retrieve-200-response-inner-location-area-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def pokemon-encounters-retrieve-200-response-inner-location-area-spec
  (ds/spec
    {:name ::pokemon-encounters-retrieve-200-response-inner-location-area
     :spec pokemon-encounters-retrieve-200-response-inner-location-area-data}))
