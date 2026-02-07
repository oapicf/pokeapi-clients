(ns pokéapi.specs.item-detail-baby-trigger-for
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-detail-baby-trigger-for-data
  {
   (ds/req :url) string?
   })

(def item-detail-baby-trigger-for-spec
  (ds/spec
    {:name ::item-detail-baby-trigger-for
     :spec item-detail-baby-trigger-for-data}))
