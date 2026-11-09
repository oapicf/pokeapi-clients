(ns pokéapi.specs.berry-flavor-map
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.berry-flavor-summary :refer :all]
            )
  (:import (java.io File)))


(def berry-flavor-map-data
  {
   (ds/req :potency) int?
   (ds/req :flavor) berry-flavor-summary-spec
   })

(def berry-flavor-map-spec
  (ds/spec
    {:name ::berry-flavor-map
     :spec berry-flavor-map-data}))
