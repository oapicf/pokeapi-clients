(ns pokéapi.specs.item-detail-machines-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def item-detail-machines-inner-data
  {
   (ds/req :machine) string?
   (ds/req :version_group) ability-detail-pokemon-inner-pokemon-spec
   })

(def item-detail-machines-inner-spec
  (ds/spec
    {:name ::item-detail-machines-inner
     :spec item-detail-machines-inner-data}))
