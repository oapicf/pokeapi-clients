(ns pokéapi.specs.pokemon-shape-detail-names-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-shape-detail-names-inner-data
  {
   (ds/req :url) string?
   (ds/req :name) string?
   })

(def pokemon-shape-detail-names-inner-spec
  (ds/spec
    {:name ::pokemon-shape-detail-names-inner
     :spec pokemon-shape-detail-names-inner-data}))
