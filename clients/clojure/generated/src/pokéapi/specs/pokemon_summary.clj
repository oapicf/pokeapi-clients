(ns pokéapi.specs.pokemon-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def pokemon-summary-spec
  (ds/spec
    {:name ::pokemon-summary
     :spec pokemon-summary-data}))
