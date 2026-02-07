(ns pokéapi.specs.evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-gender
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-gender-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-gender-spec
  (ds/spec
    {:name ::evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-gender
     :spec evolution-chain-detail-chain-evolves-to-inner-evolution-details-inner-gender-data}))
