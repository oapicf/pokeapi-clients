(ns pokéapi.specs.item-attribute-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.item-attribute-description :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.item-attribute-name :refer :all]
            )
  (:import (java.io File)))


(def item-attribute-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :descriptions) (s/coll-of item-attribute-description-spec)
   (ds/req :items) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :names) (s/coll-of item-attribute-name-spec)
   })

(def item-attribute-detail-spec
  (ds/spec
    {:name ::item-attribute-detail
     :spec item-attribute-detail-data}))
