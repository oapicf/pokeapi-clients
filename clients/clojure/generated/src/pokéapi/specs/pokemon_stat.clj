(ns pokéapi.specs.pokemon-stat
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.stat-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-stat-data
  {
   (ds/req :base_stat) int?
   (ds/req :effort) int?
   (ds/req :stat) stat-summary-spec
   })

(def pokemon-stat-spec
  (ds/spec
    {:name ::pokemon-stat
     :spec pokemon-stat-data}))
