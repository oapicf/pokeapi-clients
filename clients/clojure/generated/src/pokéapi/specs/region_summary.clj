(ns pokéapi.specs.region-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def region-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def region-summary-spec
  (ds/spec
    {:name ::region-summary
     :spec region-summary-data}))
