(ns pokéapi.specs.version-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def version-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def version-summary-spec
  (ds/spec
    {:name ::version-summary
     :spec version-summary-data}))
