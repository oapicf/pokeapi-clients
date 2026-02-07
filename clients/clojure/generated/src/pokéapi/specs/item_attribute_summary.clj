(ns pokéapi.specs.item-attribute-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-attribute-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def item-attribute-summary-spec
  (ds/spec
    {:name ::item-attribute-summary
     :spec item-attribute-summary-data}))
