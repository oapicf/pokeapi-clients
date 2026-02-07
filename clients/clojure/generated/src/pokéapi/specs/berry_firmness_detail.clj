(ns pokéapi.specs.berry-firmness-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.berry-summary :refer :all]
            [pokéapi.specs.berry-firmness-name :refer :all]
            )
  (:import (java.io File)))


(def berry-firmness-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :berries) (s/coll-of berry-summary-spec)
   (ds/req :names) (s/coll-of berry-firmness-name-spec)
   })

(def berry-firmness-detail-spec
  (ds/spec
    {:name ::berry-firmness-detail
     :spec berry-firmness-detail-data}))
