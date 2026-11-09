(ns pokéapi.specs.currency-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def currency-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def currency-summary-spec
  (ds/spec
    {:name ::currency-summary
     :spec currency-summary-data}))
