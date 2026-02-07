(ns pokéapi.specs.ability-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ability-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def ability-summary-spec
  (ds/spec
    {:name ::ability-summary
     :spec ability-summary-data}))
