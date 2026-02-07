(ns pokéapi.specs.stat-detail-affecting-natures
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def stat-detail-affecting-natures-data
  {
   (ds/req :increase) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :decrease) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   })

(def stat-detail-affecting-natures-spec
  (ds/spec
    {:name ::stat-detail-affecting-natures
     :spec stat-detail-affecting-natures-data}))
