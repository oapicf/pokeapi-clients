(ns pokéapi.specs.contest-type-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def contest-type-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def contest-type-summary-spec
  (ds/spec
    {:name ::contest-type-summary
     :spec contest-type-summary-data}))
