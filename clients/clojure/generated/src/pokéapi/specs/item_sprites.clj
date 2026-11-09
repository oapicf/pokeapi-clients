(ns pokéapi.specs.item-sprites
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-sprites-data
  {
   (ds/req :default) string?
   })

(def item-sprites-spec
  (ds/spec
    {:name ::item-sprites
     :spec item-sprites-data}))
