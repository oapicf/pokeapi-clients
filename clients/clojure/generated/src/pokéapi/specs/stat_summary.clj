(ns pokéapi.specs.stat-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def stat-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def stat-summary-spec
  (ds/spec
    {:name ::stat-summary
     :spec stat-summary-data}))
