(ns pokéapi.specs.location-area-encounter-rate
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.encounter-method-summary :refer :all]
            [pokéapi.specs.location-area-encounter-version-detail :refer :all]
            )
  (:import (java.io File)))


(def location-area-encounter-rate-data
  {
   (ds/req :encounter_method) encounter-method-summary-spec
   (ds/req :version_details) (s/coll-of location-area-encounter-version-detail-spec)
   })

(def location-area-encounter-rate-spec
  (ds/spec
    {:name ::location-area-encounter-rate
     :spec location-area-encounter-rate-data}))
