(ns pokéapi.specs.pokemon-species-detail-pal-park-encounters-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def pokemon-species-detail-pal-park-encounters-inner-data
  {
   (ds/req :area) ability-detail-pokemon-inner-pokemon-spec
   (ds/req :base_score) int?
   (ds/req :rate) int?
   })

(def pokemon-species-detail-pal-park-encounters-inner-spec
  (ds/spec
    {:name ::pokemon-species-detail-pal-park-encounters-inner
     :spec pokemon-species-detail-pal-park-encounters-inner-data}))
