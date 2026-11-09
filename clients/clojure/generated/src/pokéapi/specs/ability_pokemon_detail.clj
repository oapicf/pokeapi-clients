(ns pokéapi.specs.ability-pokemon-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-summary :refer :all]
            )
  (:import (java.io File)))


(def ability-pokemon-detail-data
  {
   (ds/opt :is_hidden) boolean?
   (ds/req :slot) int?
   (ds/req :pokemon) pokemon-summary-spec
   })

(def ability-pokemon-detail-spec
  (ds/spec
    {:name ::ability-pokemon-detail
     :spec ability-pokemon-detail-data}))
