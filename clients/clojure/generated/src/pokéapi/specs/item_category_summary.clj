(ns pokéapi.specs.item-category-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-category-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def item-category-summary-spec
  (ds/spec
    {:name ::item-category-summary
     :spec item-category-summary-data}))
