(ns pokéapi.specs.location-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def location-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def location-summary-spec
  (ds/spec
    {:name ::location-summary
     :spec location-summary-data}))
