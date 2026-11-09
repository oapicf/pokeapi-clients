(ns pokéapi.specs.pokemon-cries
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-cries-data
  {
   (ds/req :latest) string?
   (ds/req :legacy) string?
   })

(def pokemon-cries-spec
  (ds/spec
    {:name ::pokemon-cries
     :spec pokemon-cries-data}))
