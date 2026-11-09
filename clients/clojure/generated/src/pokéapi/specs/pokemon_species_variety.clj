(ns pokéapi.specs.pokemon-species-variety
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-species-variety-data
  {
   (ds/req :is_default) boolean?
   (ds/req :pokemon) pokemon-summary-spec
   })

(def pokemon-species-variety-spec
  (ds/spec
    {:name ::pokemon-species-variety
     :spec pokemon-species-variety-data}))
