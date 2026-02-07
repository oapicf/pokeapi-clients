(ns pokéapi.specs.evolution-trigger-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def evolution-trigger-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def evolution-trigger-summary-spec
  (ds/spec
    {:name ::evolution-trigger-summary
     :spec evolution-trigger-summary-data}))
