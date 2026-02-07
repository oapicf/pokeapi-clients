(ns pokéapi.specs.stat-detail-affecting-moves
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.stat-detail-affecting-moves-increase-inner :refer :all]
            [pokéapi.specs.stat-detail-affecting-moves-increase-inner :refer :all]
            )
  (:import (java.io File)))


(def stat-detail-affecting-moves-data
  {
   (ds/req :increase) (s/coll-of stat-detail-affecting-moves-increase-inner-spec)
   (ds/req :decrease) (s/coll-of stat-detail-affecting-moves-increase-inner-spec)
   })

(def stat-detail-affecting-moves-spec
  (ds/spec
    {:name ::stat-detail-affecting-moves
     :spec stat-detail-affecting-moves-data}))
