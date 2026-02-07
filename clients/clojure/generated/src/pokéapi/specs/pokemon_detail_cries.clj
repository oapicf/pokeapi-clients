(ns pokéapi.specs.pokemon-detail-cries
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-detail-cries-data
  {
   (ds/req :latest) string?
   (ds/req :legacy) string?
   })

(def pokemon-detail-cries-spec
  (ds/spec
    {:name ::pokemon-detail-cries
     :spec pokemon-detail-cries-data}))
