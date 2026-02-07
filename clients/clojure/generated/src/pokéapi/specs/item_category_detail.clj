(ns pokéapi.specs.item-category-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.item-summary :refer :all]
            [pokéapi.specs.item-category-name :refer :all]
            [pokéapi.specs.item-pocket-summary :refer :all]
            )
  (:import (java.io File)))


(def item-category-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :items) (s/coll-of item-summary-spec)
   (ds/req :names) (s/coll-of item-category-name-spec)
   (ds/req :pocket) item-pocket-summary-spec
   })

(def item-category-detail-spec
  (ds/spec
    {:name ::item-category-detail
     :spec item-category-detail-data}))
