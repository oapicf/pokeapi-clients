(ns pokéapi.specs.move-learn-method-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def move-learn-method-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def move-learn-method-summary-spec
  (ds/spec
    {:name ::move-learn-method-summary
     :spec move-learn-method-summary-data}))
