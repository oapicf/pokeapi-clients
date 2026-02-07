(ns pokéapi.specs.egg-group-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def egg-group-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def egg-group-summary-spec
  (ds/spec
    {:name ::egg-group-summary
     :spec egg-group-summary-data}))
