(ns pokéapi.specs.pal-park-area-detail-pokemon-encounters-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def pal-park-area-detail-pokemon-encounters-inner-data
  {
   (ds/req :base_score) int?
   (ds/req :pokemon-species) ability-detail-pokemon-inner-pokemon-spec
   (ds/req :rate) int?
   })

(def pal-park-area-detail-pokemon-encounters-inner-spec
  (ds/spec
    {:name ::pal-park-area-detail-pokemon-encounters-inner
     :spec pal-park-area-detail-pokemon-encounters-inner-data}))
