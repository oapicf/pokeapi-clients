(ns pokéapi.specs.move-target-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-target-description :refer :all]
            [pokéapi.specs.move-summary :refer :all]
            [pokéapi.specs.move-target-name :refer :all]
            )
  (:import (java.io File)))


(def move-target-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :descriptions) (s/coll-of move-target-description-spec)
   (ds/req :moves) (s/coll-of move-summary-spec)
   (ds/req :names) (s/coll-of move-target-name-spec)
   })

(def move-target-detail-spec
  (ds/spec
    {:name ::move-target-detail
     :spec move-target-detail-data}))
