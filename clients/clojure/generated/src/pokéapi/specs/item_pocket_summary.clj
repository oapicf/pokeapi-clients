(ns pokéapi.specs.item-pocket-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-pocket-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def item-pocket-summary-spec
  (ds/spec
    {:name ::item-pocket-summary
     :spec item-pocket-summary-data}))
