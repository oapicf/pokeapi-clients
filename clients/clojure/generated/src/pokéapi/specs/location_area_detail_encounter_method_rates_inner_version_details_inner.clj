(ns pokéapi.specs.location-area-detail-encounter-method-rates-inner-version-details-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def location-area-detail-encounter-method-rates-inner-version-details-inner-data
  {
   (ds/req :rate) int?
   (ds/req :version) ability-detail-pokemon-inner-pokemon-spec
   })

(def location-area-detail-encounter-method-rates-inner-version-details-inner-spec
  (ds/spec
    {:name ::location-area-detail-encounter-method-rates-inner-version-details-inner
     :spec location-area-detail-encounter-method-rates-inner-version-details-inner-data}))
