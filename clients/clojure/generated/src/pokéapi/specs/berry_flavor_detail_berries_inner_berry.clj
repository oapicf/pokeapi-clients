(ns pokéapi.specs.berry-flavor-detail-berries-inner-berry
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def berry-flavor-detail-berries-inner-berry-data
  {
   (ds/opt :name) string?
   (ds/opt :url) string?
   })

(def berry-flavor-detail-berries-inner-berry-spec
  (ds/spec
    {:name ::berry-flavor-detail-berries-inner-berry
     :spec berry-flavor-detail-berries-inner-berry-data}))
