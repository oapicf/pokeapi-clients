(ns pokéapi.specs.pokemon-encounter-version-detail-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.version-summary :refer :all]
            [pokéapi.specs.pokemon-encounter-detail-response :refer :all]
            )
  (:import (java.io File)))


(def pokemon-encounter-version-detail-response-data
  {
   (ds/req :version) version-summary-spec
   (ds/req :max_chance) int?
   (ds/req :encounter_details) (s/coll-of pokemon-encounter-detail-response-spec)
   })

(def pokemon-encounter-version-detail-response-spec
  (ds/spec
    {:name ::pokemon-encounter-version-detail-response
     :spec pokemon-encounter-version-detail-response-data}))
