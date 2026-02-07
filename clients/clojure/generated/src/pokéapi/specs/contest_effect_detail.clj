(ns pokéapi.specs.contest-effect-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.contest-effect-effect-text :refer :all]
            [pokéapi.specs.contest-effect-flavor-text :refer :all]
            )
  (:import (java.io File)))


(def contest-effect-detail-data
  {
   (ds/req :id) int?
   (ds/req :appeal) int?
   (ds/req :jam) int?
   (ds/req :effect_entries) (s/coll-of contest-effect-effect-text-spec)
   (ds/req :flavor_text_entries) (s/coll-of contest-effect-flavor-text-spec)
   })

(def contest-effect-detail-spec
  (ds/spec
    {:name ::contest-effect-detail
     :spec contest-effect-detail-data}))
