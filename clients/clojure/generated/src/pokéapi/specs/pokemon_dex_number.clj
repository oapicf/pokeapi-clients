(ns pokéapi.specs.pokemon-dex-number
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-dex-number-data
  {
   (ds/req :entry_number) int?
   (ds/req :pokemon_species) pokemon-species-summary-spec
   })

(def pokemon-dex-number-spec
  (ds/spec
    {:name ::pokemon-dex-number
     :spec pokemon-dex-number-data}))
