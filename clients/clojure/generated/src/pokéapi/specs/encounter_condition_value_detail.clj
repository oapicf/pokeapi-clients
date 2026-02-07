(ns pokéapi.specs.encounter-condition-value-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.encounter-condition-summary :refer :all]
            [pokéapi.specs.encounter-condition-value-name :refer :all]
            )
  (:import (java.io File)))


(def encounter-condition-value-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :condition) encounter-condition-summary-spec
   (ds/req :names) (s/coll-of encounter-condition-value-name-spec)
   })

(def encounter-condition-value-detail-spec
  (ds/spec
    {:name ::encounter-condition-value-detail
     :spec encounter-condition-value-detail-data}))
