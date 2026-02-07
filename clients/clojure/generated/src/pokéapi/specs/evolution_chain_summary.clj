(ns pokéapi.specs.evolution-chain-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def evolution-chain-summary-data
  {
   (ds/req :url) string?
   })

(def evolution-chain-summary-spec
  (ds/spec
    {:name ::evolution-chain-summary
     :spec evolution-chain-summary-data}))
