(ns pokéapi.specs.pokemon-form-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-form-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def pokemon-form-summary-spec
  (ds/spec
    {:name ::pokemon-form-summary
     :spec pokemon-form-summary-data}))
