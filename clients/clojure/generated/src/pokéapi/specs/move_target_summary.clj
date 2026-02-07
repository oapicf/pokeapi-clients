(ns pokéapi.specs.move-target-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def move-target-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def move-target-summary-spec
  (ds/spec
    {:name ::move-target-summary
     :spec move-target-summary-data}))
