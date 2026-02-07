(ns pokéapi.specs.encounter-condition-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.encounter-condition-value-summary :refer :all]
            [pokéapi.specs.encounter-condition-name :refer :all]
            )
  (:import (java.io File)))


(def encounter-condition-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :values) (s/coll-of encounter-condition-value-summary-spec)
   (ds/req :names) (s/coll-of encounter-condition-name-spec)
   })

(def encounter-condition-detail-spec
  (ds/spec
    {:name ::encounter-condition-detail
     :spec encounter-condition-detail-data}))
