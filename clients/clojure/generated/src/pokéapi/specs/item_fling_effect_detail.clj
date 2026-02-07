(ns pokéapi.specs.item-fling-effect-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.item-fling-effect-effect-text :refer :all]
            [pokéapi.specs.item-summary :refer :all]
            )
  (:import (java.io File)))


(def item-fling-effect-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :effect_entries) (s/coll-of item-fling-effect-effect-text-spec)
   (ds/req :items) (s/coll-of item-summary-spec)
   })

(def item-fling-effect-detail-spec
  (ds/spec
    {:name ::item-fling-effect-detail
     :spec item-fling-effect-detail-data}))
