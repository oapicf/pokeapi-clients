(ns pokéapi.specs.evolution-variable-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def evolution-variable-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def evolution-variable-summary-spec
  (ds/spec
    {:name ::evolution-variable-summary
     :spec evolution-variable-summary-data}))
