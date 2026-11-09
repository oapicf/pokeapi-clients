(ns pokéapi.specs.pal-park-encounter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-species-summary :refer :all]
            )
  (:import (java.io File)))


(def pal-park-encounter-data
  {
   (ds/opt :base_score) int?
   (ds/req :rate) int?
   (ds/req :pokemon_species) pokemon-species-summary-spec
   })

(def pal-park-encounter-spec
  (ds/spec
    {:name ::pal-park-encounter
     :spec pal-park-encounter-data}))
