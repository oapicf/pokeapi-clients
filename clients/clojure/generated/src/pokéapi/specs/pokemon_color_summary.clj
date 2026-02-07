(ns pokéapi.specs.pokemon-color-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-color-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def pokemon-color-summary-spec
  (ds/spec
    {:name ::pokemon-color-summary
     :spec pokemon-color-summary-data}))
