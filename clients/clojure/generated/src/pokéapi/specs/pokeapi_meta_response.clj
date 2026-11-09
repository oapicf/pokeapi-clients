(ns pokéapi.specs.pokeapi-meta-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokeapi-meta-response-data
  {
   (ds/req :deploy_date) string?
   (ds/req :hash) string?
   (ds/req :tag) string?
   })

(def pokeapi-meta-response-spec
  (ds/spec
    {:name ::pokeapi-meta-response
     :spec pokeapi-meta-response-data}))
