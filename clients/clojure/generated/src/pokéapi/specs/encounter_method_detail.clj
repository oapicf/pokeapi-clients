(ns pokéapi.specs.encounter-method-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.encounter-method-name :refer :all]
            )
  (:import (java.io File)))


(def encounter-method-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/opt :order) int?
   (ds/req :names) (s/coll-of encounter-method-name-spec)
   })

(def encounter-method-detail-spec
  (ds/spec
    {:name ::encounter-method-detail
     :spec encounter-method-detail-data}))
