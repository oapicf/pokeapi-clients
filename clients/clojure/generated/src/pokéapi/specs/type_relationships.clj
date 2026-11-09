(ns pokéapi.specs.type-relationships
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.type-summary :refer :all]
            [pokéapi.specs.type-summary :refer :all]
            [pokéapi.specs.type-summary :refer :all]
            [pokéapi.specs.type-summary :refer :all]
            [pokéapi.specs.type-summary :refer :all]
            [pokéapi.specs.type-summary :refer :all]
            )
  (:import (java.io File)))


(def type-relationships-data
  {
   (ds/req :no_damage_to) (s/coll-of type-summary-spec)
   (ds/req :half_damage_to) (s/coll-of type-summary-spec)
   (ds/req :double_damage_to) (s/coll-of type-summary-spec)
   (ds/req :no_damage_from) (s/coll-of type-summary-spec)
   (ds/req :half_damage_from) (s/coll-of type-summary-spec)
   (ds/req :double_damage_from) (s/coll-of type-summary-spec)
   })

(def type-relationships-spec
  (ds/spec
    {:name ::type-relationships
     :spec type-relationships-data}))
