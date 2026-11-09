(ns pokéapi.specs.move-combo-usage
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-summary :refer :all]
            [pokéapi.specs.move-summary :refer :all]
            )
  (:import (java.io File)))


(def move-combo-usage-data
  {
   (ds/req :use_before) (s/coll-of move-summary-spec)
   (ds/req :use_after) (s/coll-of move-summary-spec)
   })

(def move-combo-usage-spec
  (ds/spec
    {:name ::move-combo-usage
     :spec move-combo-usage-data}))
