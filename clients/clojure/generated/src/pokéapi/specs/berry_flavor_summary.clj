(ns pokéapi.specs.berry-flavor-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def berry-flavor-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def berry-flavor-summary-spec
  (ds/spec
    {:name ::berry-flavor-summary
     :spec berry-flavor-summary-data}))
