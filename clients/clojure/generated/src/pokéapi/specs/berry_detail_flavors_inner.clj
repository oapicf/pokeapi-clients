(ns pokéapi.specs.berry-detail-flavors-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.berry-detail-flavors-inner-flavor :refer :all]
            )
  (:import (java.io File)))


(def berry-detail-flavors-inner-data
  {
   (ds/req :potency) int?
   (ds/req :flavor) berry-detail-flavors-inner-flavor-spec
   })

(def berry-detail-flavors-inner-spec
  (ds/spec
    {:name ::berry-detail-flavors-inner
     :spec berry-detail-flavors-inner-data}))
