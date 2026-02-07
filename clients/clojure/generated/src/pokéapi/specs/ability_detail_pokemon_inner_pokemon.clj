(ns pokéapi.specs.ability-detail-pokemon-inner-pokemon
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ability-detail-pokemon-inner-pokemon-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def ability-detail-pokemon-inner-pokemon-spec
  (ds/spec
    {:name ::ability-detail-pokemon-inner-pokemon
     :spec ability-detail-pokemon-inner-pokemon-data}))
