(ns pokéapi.specs.item-fling-effect-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-fling-effect-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def item-fling-effect-summary-spec
  (ds/spec
    {:name ::item-fling-effect-summary
     :spec item-fling-effect-summary-data}))
