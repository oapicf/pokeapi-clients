(ns pokéapi.specs.pokemon-species-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-species-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def pokemon-species-summary-spec
  (ds/spec
    {:name ::pokemon-species-summary
     :spec pokemon-species-summary-data}))
