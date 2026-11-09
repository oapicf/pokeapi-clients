(ns pokéapi.specs.move-meta-category-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-meta-category-description :refer :all]
            [pokéapi.specs.move-summary :refer :all]
            )
  (:import (java.io File)))


(def move-meta-category-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :descriptions) (s/coll-of move-meta-category-description-spec)
   (ds/req :moves) (s/coll-of move-summary-spec)
   })

(def move-meta-category-detail-spec
  (ds/spec
    {:name ::move-meta-category-detail
     :spec move-meta-category-detail-data}))
