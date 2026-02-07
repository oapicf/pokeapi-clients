(ns pokéapi.specs.type-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def type-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def type-summary-spec
  (ds/spec
    {:name ::type-summary
     :spec type-summary-data}))
