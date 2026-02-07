(ns pokéapi.specs.move-detail-contest-combos-normal
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def move-detail-contest-combos-normal-data
  {
   (ds/req :use_before) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :use_after) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   })

(def move-detail-contest-combos-normal-spec
  (ds/spec
    {:name ::move-detail-contest-combos-normal
     :spec move-detail-contest-combos-normal-data}))
