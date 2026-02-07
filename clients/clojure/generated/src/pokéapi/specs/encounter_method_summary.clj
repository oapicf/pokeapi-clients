(ns pokéapi.specs.encounter-method-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def encounter-method-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def encounter-method-summary-spec
  (ds/spec
    {:name ::encounter-method-summary
     :spec encounter-method-summary-data}))
