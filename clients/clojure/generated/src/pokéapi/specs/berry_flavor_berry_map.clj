(ns pokéapi.specs.berry-flavor-berry-map
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.berry-summary :refer :all]
            )
  (:import (java.io File)))


(def berry-flavor-berry-map-data
  {
   (ds/req :potency) int?
   (ds/req :berry) berry-summary-spec
   })

(def berry-flavor-berry-map-spec
  (ds/spec
    {:name ::berry-flavor-berry-map
     :spec berry-flavor-berry-map-data}))
