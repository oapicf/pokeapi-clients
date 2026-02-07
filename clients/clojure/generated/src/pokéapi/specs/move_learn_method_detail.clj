(ns pokéapi.specs.move-learn-method-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-learn-method-name :refer :all]
            [pokéapi.specs.move-learn-method-description :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def move-learn-method-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :names) (s/coll-of move-learn-method-name-spec)
   (ds/req :descriptions) (s/coll-of move-learn-method-description-spec)
   (ds/req :version_groups) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   })

(def move-learn-method-detail-spec
  (ds/spec
    {:name ::move-learn-method-detail
     :spec move-learn-method-detail-data}))
