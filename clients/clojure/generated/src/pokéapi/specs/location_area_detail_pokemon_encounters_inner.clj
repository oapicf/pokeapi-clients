(ns pokéapi.specs.location-area-detail-pokemon-encounters-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.location-area-detail-pokemon-encounters-inner-version-details-inner :refer :all]
            )
  (:import (java.io File)))


(def location-area-detail-pokemon-encounters-inner-data
  {
   (ds/req :pokemon) ability-detail-pokemon-inner-pokemon-spec
   (ds/req :version_details) (s/coll-of location-area-detail-pokemon-encounters-inner-version-details-inner-spec)
   })

(def location-area-detail-pokemon-encounters-inner-spec
  (ds/spec
    {:name ::location-area-detail-pokemon-encounters-inner
     :spec location-area-detail-pokemon-encounters-inner-data}))
