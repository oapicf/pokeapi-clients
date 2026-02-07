(ns pokéapi.specs.berry-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def berry-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def berry-summary-spec
  (ds/spec
    {:name ::berry-summary
     :spec berry-summary-data}))
