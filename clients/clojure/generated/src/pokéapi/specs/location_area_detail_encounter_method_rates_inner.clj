(ns pokéapi.specs.location-area-detail-encounter-method-rates-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.location-area-detail-encounter-method-rates-inner-version-details-inner :refer :all]
            )
  (:import (java.io File)))


(def location-area-detail-encounter-method-rates-inner-data
  {
   (ds/req :encounter_method) ability-detail-pokemon-inner-pokemon-spec
   (ds/req :version_details) (s/coll-of location-area-detail-encounter-method-rates-inner-version-details-inner-spec)
   })

(def location-area-detail-encounter-method-rates-inner-spec
  (ds/spec
    {:name ::location-area-detail-encounter-method-rates-inner
     :spec location-area-detail-encounter-method-rates-inner-data}))
