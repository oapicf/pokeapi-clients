(ns pokéapi.specs.type-detail-sprites-value-value
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def type-detail-sprites-value-value-data
  {
   (ds/opt :name-icon) string?
   })

(def type-detail-sprites-value-value-spec
  (ds/spec
    {:name ::type-detail-sprites-value-value
     :spec type-detail-sprites-value-value-data}))
