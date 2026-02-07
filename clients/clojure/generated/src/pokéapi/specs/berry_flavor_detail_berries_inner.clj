(ns pokéapi.specs.berry-flavor-detail-berries-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.berry-flavor-detail-berries-inner-berry :refer :all]
            )
  (:import (java.io File)))


(def berry-flavor-detail-berries-inner-data
  {
   (ds/req :potency) int?
   (ds/req :berry) berry-flavor-detail-berries-inner-berry-spec
   })

(def berry-flavor-detail-berries-inner-spec
  (ds/spec
    {:name ::berry-flavor-detail-berries-inner
     :spec berry-flavor-detail-berries-inner-data}))
