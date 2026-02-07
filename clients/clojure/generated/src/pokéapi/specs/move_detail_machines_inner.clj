(ns pokéapi.specs.move-detail-machines-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-detail-machines-inner-machine :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def move-detail-machines-inner-data
  {
   (ds/req :machine) move-detail-machines-inner-machine-spec
   (ds/req :version_group) ability-detail-pokemon-inner-pokemon-spec
   })

(def move-detail-machines-inner-spec
  (ds/spec
    {:name ::move-detail-machines-inner
     :spec move-detail-machines-inner-data}))
