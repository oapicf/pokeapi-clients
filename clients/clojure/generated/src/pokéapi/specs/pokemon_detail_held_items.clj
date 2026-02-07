(ns pokéapi.specs.pokemon-detail-held-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.item-detail-held-by-pokemon-inner-version-details-inner :refer :all]
            )
  (:import (java.io File)))


(def pokemon-detail-held-items-data
  {
   (ds/req :item) ability-detail-pokemon-inner-pokemon-spec
   (ds/req :version_details) (s/coll-of item-detail-held-by-pokemon-inner-version-details-inner-spec)
   })

(def pokemon-detail-held-items-spec
  (ds/spec
    {:name ::pokemon-detail-held-items
     :spec pokemon-detail-held-items-data}))
