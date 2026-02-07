(ns pokéapi.specs.item-detail-held-by-pokemon-inner-version-details-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def item-detail-held-by-pokemon-inner-version-details-inner-data
  {
   (ds/req :rarity) int?
   (ds/req :version) ability-detail-pokemon-inner-pokemon-spec
   })

(def item-detail-held-by-pokemon-inner-version-details-inner-spec
  (ds/spec
    {:name ::item-detail-held-by-pokemon-inner-version-details-inner
     :spec item-detail-held-by-pokemon-inner-version-details-inner-data}))
