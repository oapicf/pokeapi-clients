(ns pokéapi.specs.item-pocket-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.item-category-summary :refer :all]
            [pokéapi.specs.item-pocket-name :refer :all]
            )
  (:import (java.io File)))


(def item-pocket-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :categories) (s/coll-of item-category-summary-spec)
   (ds/req :names) (s/coll-of item-pocket-name-spec)
   })

(def item-pocket-detail-spec
  (ds/spec
    {:name ::item-pocket-detail
     :spec item-pocket-detail-data}))
