(ns pokéapi.specs.generation-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def generation-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def generation-summary-spec
  (ds/spec
    {:name ::generation-summary
     :spec generation-summary-data}))
