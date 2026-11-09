(ns pokéapi.specs.type-pokemon
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-summary :refer :all]
            )
  (:import (java.io File)))


(def type-pokemon-data
  {
   (ds/req :slot) int?
   (ds/req :pokemon) pokemon-summary-spec
   })

(def type-pokemon-spec
  (ds/spec
    {:name ::type-pokemon
     :spec type-pokemon-data}))
