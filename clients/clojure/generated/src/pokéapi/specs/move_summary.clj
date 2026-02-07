(ns pokéapi.specs.move-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def move-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def move-summary-spec
  (ds/spec
    {:name ::move-summary
     :spec move-summary-data}))
