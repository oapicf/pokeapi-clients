(ns pokéapi.specs.item-detail-sprites
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-detail-sprites-data
  {
   (ds/req :default) string?
   })

(def item-detail-sprites-spec
  (ds/spec
    {:name ::item-detail-sprites
     :spec item-detail-sprites-data}))
