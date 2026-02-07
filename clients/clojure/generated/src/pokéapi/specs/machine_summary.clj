(ns pokéapi.specs.machine-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def machine-summary-data
  {
   (ds/req :url) string?
   })

(def machine-summary-spec
  (ds/spec
    {:name ::machine-summary
     :spec machine-summary-data}))
