(ns pokéapi.specs.item-detail-held-by-pokemon-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.item-detail-held-by-pokemon-inner-version-details-inner :refer :all]
            )
  (:import (java.io File)))


(def item-detail-held-by-pokemon-inner-data
  {
   (ds/req :pokemon) ability-detail-pokemon-inner-pokemon-spec
   (ds/req :version-details) (s/coll-of item-detail-held-by-pokemon-inner-version-details-inner-spec)
   })

(def item-detail-held-by-pokemon-inner-spec
  (ds/spec
    {:name ::item-detail-held-by-pokemon-inner
     :spec item-detail-held-by-pokemon-inner-data}))
