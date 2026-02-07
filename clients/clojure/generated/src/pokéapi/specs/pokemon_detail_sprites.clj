(ns pokéapi.specs.pokemon-detail-sprites
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-detail-sprites-data
  {
   (ds/opt :front_default) string?
   })

(def pokemon-detail-sprites-spec
  (ds/spec
    {:name ::pokemon-detail-sprites
     :spec pokemon-detail-sprites-data}))
