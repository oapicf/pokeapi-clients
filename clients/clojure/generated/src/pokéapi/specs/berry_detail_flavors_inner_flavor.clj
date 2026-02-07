(ns pokéapi.specs.berry-detail-flavors-inner-flavor
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def berry-detail-flavors-inner-flavor-data
  {
   (ds/opt :name) string?
   (ds/opt :url) string?
   })

(def berry-detail-flavors-inner-flavor-spec
  (ds/spec
    {:name ::berry-detail-flavors-inner-flavor
     :spec berry-detail-flavors-inner-flavor-data}))
