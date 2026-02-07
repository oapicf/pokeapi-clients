(ns pokéapi.specs.pokemon-form-detail-sprites
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-form-detail-sprites-data
  {
   (ds/opt :default) string?
   })

(def pokemon-form-detail-sprites-spec
  (ds/spec
    {:name ::pokemon-form-detail-sprites
     :spec pokemon-form-detail-sprites-data}))
