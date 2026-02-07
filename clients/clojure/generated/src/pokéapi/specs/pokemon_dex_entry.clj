(ns pokéapi.specs.pokemon-dex-entry
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokedex-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-dex-entry-data
  {
   (ds/req :entry_number) int?
   (ds/req :pokedex) pokedex-summary-spec
   })

(def pokemon-dex-entry-spec
  (ds/spec
    {:name ::pokemon-dex-entry
     :spec pokemon-dex-entry-data}))
