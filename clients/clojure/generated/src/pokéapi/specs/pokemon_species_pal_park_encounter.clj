(ns pokéapi.specs.pokemon-species-pal-park-encounter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pal-park-area-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-species-pal-park-encounter-data
  {
   (ds/opt :base_score) int?
   (ds/req :rate) int?
   (ds/req :area) pal-park-area-summary-spec
   })

(def pokemon-species-pal-park-encounter-spec
  (ds/spec
    {:name ::pokemon-species-pal-park-encounter
     :spec pokemon-species-pal-park-encounter-data}))
