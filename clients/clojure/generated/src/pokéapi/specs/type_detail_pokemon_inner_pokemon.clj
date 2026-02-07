(ns pokéapi.specs.type-detail-pokemon-inner-pokemon
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def type-detail-pokemon-inner-pokemon-data
  {
   (ds/opt :name) string?
   (ds/opt :url) string?
   })

(def type-detail-pokemon-inner-pokemon-spec
  (ds/spec
    {:name ::type-detail-pokemon-inner-pokemon
     :spec type-detail-pokemon-inner-pokemon-data}))
