(ns pokéapi.specs.location-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.region-summary :refer :all]
            [pokéapi.specs.location-name :refer :all]
            [pokéapi.specs.location-game-index :refer :all]
            [pokéapi.specs.location-area-summary :refer :all]
            )
  (:import (java.io File)))


(def location-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :region) region-summary-spec
   (ds/req :names) (s/coll-of location-name-spec)
   (ds/req :game_indices) (s/coll-of location-game-index-spec)
   (ds/req :areas) (s/coll-of location-area-summary-spec)
   })

(def location-detail-spec
  (ds/spec
    {:name ::location-detail
     :spec location-detail-data}))
