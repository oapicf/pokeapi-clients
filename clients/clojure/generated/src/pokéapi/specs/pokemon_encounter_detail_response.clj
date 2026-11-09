(ns pokéapi.specs.pokemon-encounter-detail-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.encounter-condition-value-summary :refer :all]
            [pokéapi.specs.encounter-method-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-encounter-detail-response-data
  {
   (ds/req :chance) int?
   (ds/req :condition_values) (s/coll-of encounter-condition-value-summary-spec)
   (ds/req :max_level) int?
   (ds/req :method) encounter-method-summary-spec
   (ds/req :min_level) int?
   })

(def pokemon-encounter-detail-response-spec
  (ds/spec
    {:name ::pokemon-encounter-detail-response
     :spec pokemon-encounter-detail-response-data}))
