(ns pokéapi.specs.move-detail-contest-combos
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-detail-contest-combos-normal :refer :all]
            [pokéapi.specs.move-detail-contest-combos-normal :refer :all]
            )
  (:import (java.io File)))


(def move-detail-contest-combos-data
  {
   (ds/req :normal) move-detail-contest-combos-normal-spec
   (ds/req :super) move-detail-contest-combos-normal-spec
   })

(def move-detail-contest-combos-spec
  (ds/spec
    {:name ::move-detail-contest-combos
     :spec move-detail-contest-combos-data}))
