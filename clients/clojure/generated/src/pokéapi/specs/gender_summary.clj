(ns pokéapi.specs.gender-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gender-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def gender-summary-spec
  (ds/spec
    {:name ::gender-summary
     :spec gender-summary-data}))
