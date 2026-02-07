(ns pokéapi.specs.growth-rate-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def growth-rate-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def growth-rate-summary-spec
  (ds/spec
    {:name ::growth-rate-summary
     :spec growth-rate-summary-data}))
