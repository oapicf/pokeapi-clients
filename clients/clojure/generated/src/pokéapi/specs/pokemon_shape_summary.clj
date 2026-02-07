(ns pokéapi.specs.pokemon-shape-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-shape-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def pokemon-shape-summary-spec
  (ds/spec
    {:name ::pokemon-shape-summary
     :spec pokemon-shape-summary-data}))
