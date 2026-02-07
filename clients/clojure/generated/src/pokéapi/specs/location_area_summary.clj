(ns pokéapi.specs.location-area-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def location-area-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def location-area-summary-spec
  (ds/spec
    {:name ::location-area-summary
     :spec location-area-summary-data}))
