(ns pokéapi.specs.version-group-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def version-group-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def version-group-summary-spec
  (ds/spec
    {:name ::version-group-summary
     :spec version-group-summary-data}))
