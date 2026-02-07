(ns pokéapi.specs.move-damage-class-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-damage-class-description :refer :all]
            [pokéapi.specs.move-summary :refer :all]
            [pokéapi.specs.move-damage-class-name :refer :all]
            )
  (:import (java.io File)))


(def move-damage-class-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :descriptions) (s/coll-of move-damage-class-description-spec)
   (ds/req :moves) (s/coll-of move-summary-spec)
   (ds/req :names) (s/coll-of move-damage-class-name-spec)
   })

(def move-damage-class-detail-spec
  (ds/spec
    {:name ::move-damage-class-detail
     :spec move-damage-class-detail-data}))
