(ns pokéapi.specs.super-contest-effect-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def super-contest-effect-summary-data
  {
   (ds/req :url) string?
   })

(def super-contest-effect-summary-spec
  (ds/spec
    {:name ::super-contest-effect-summary
     :spec super-contest-effect-summary-data}))
