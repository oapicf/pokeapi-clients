(ns pokéapi.specs.location-area-encounter-version-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.version-summary :refer :all]
            )
  (:import (java.io File)))


(def location-area-encounter-version-detail-data
  {
   (ds/req :rate) int?
   (ds/req :version) version-summary-spec
   })

(def location-area-encounter-version-detail-spec
  (ds/spec
    {:name ::location-area-encounter-version-detail
     :spec location-area-encounter-version-detail-data}))
