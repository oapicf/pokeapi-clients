(ns pokéapi.specs.move-battle-style-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-battle-style-name :refer :all]
            )
  (:import (java.io File)))


(def move-battle-style-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :names) (s/coll-of move-battle-style-name-spec)
   })

(def move-battle-style-detail-spec
  (ds/spec
    {:name ::move-battle-style-detail
     :spec move-battle-style-detail-data}))
