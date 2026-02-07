(ns pokéapi.specs.evolution-chain-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.item-summary :refer :all]
            [pokéapi.specs.evolution-chain-detail-chain :refer :all]
            )
  (:import (java.io File)))


(def evolution-chain-detail-data
  {
   (ds/req :id) int?
   (ds/req :baby_trigger_item) item-summary-spec
   (ds/req :chain) evolution-chain-detail-chain-spec
   })

(def evolution-chain-detail-spec
  (ds/spec
    {:name ::evolution-chain-detail
     :spec evolution-chain-detail-data}))
