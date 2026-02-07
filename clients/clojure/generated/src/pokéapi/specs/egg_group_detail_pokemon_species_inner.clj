(ns pokéapi.specs.egg-group-detail-pokemon-species-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def egg-group-detail-pokemon-species-inner-data
  {
   (ds/opt :name) string?
   (ds/opt :url) string?
   })

(def egg-group-detail-pokemon-species-inner-spec
  (ds/spec
    {:name ::egg-group-detail-pokemon-species-inner
     :spec egg-group-detail-pokemon-species-inner-data}))
