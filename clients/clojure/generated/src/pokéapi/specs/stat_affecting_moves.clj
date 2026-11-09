(ns pokéapi.specs.stat-affecting-moves
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-stat-change :refer :all]
            [pokéapi.specs.move-stat-change :refer :all]
            )
  (:import (java.io File)))


(def stat-affecting-moves-data
  {
   (ds/req :increase) (s/coll-of move-stat-change-spec)
   (ds/req :decrease) (s/coll-of move-stat-change-spec)
   })

(def stat-affecting-moves-spec
  (ds/spec
    {:name ::stat-affecting-moves
     :spec stat-affecting-moves-data}))
