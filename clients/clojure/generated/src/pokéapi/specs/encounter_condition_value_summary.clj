(ns pokéapi.specs.encounter-condition-value-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def encounter-condition-value-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def encounter-condition-value-summary-spec
  (ds/spec
    {:name ::encounter-condition-value-summary
     :spec encounter-condition-value-summary-data}))
