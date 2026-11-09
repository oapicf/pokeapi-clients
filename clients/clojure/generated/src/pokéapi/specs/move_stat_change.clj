(ns pokéapi.specs.move-stat-change
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-summary :refer :all]
            )
  (:import (java.io File)))


(def move-stat-change-data
  {
   (ds/req :change) int?
   (ds/req :move) move-summary-spec
   })

(def move-stat-change-spec
  (ds/spec
    {:name ::move-stat-change
     :spec move-stat-change-data}))
