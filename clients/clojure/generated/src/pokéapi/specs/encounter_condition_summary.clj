(ns pokéapi.specs.encounter-condition-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def encounter-condition-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def encounter-condition-summary-spec
  (ds/spec
    {:name ::encounter-condition-summary
     :spec encounter-condition-summary-data}))
