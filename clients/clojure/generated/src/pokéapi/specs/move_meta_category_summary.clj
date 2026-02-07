(ns pokéapi.specs.move-meta-category-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def move-meta-category-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def move-meta-category-summary-spec
  (ds/spec
    {:name ::move-meta-category-summary
     :spec move-meta-category-summary-data}))
