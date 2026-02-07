(ns pokéapi.specs.pokemon-habitat-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-habitat-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def pokemon-habitat-summary-spec
  (ds/spec
    {:name ::pokemon-habitat-summary
     :spec pokemon-habitat-summary-data}))
