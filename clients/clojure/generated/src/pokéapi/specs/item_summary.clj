(ns pokéapi.specs.item-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def item-summary-spec
  (ds/spec
    {:name ::item-summary
     :spec item-summary-data}))
