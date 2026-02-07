(ns pokéapi.specs.contest-effect-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def contest-effect-summary-data
  {
   (ds/req :url) string?
   })

(def contest-effect-summary-spec
  (ds/spec
    {:name ::contest-effect-summary
     :spec contest-effect-summary-data}))
