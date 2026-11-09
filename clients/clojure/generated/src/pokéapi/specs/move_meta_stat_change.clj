(ns pokéapi.specs.move-meta-stat-change
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.stat-summary :refer :all]
            )
  (:import (java.io File)))


(def move-meta-stat-change-data
  {
   (ds/req :change) int?
   (ds/req :stat) stat-summary-spec
   })

(def move-meta-stat-change-spec
  (ds/spec
    {:name ::move-meta-stat-change
     :spec move-meta-stat-change-data}))
