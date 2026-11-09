(ns pokéapi.specs.item-price
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.currency-summary :refer :all]
            [pokéapi.specs.version-group-summary :refer :all]
            )
  (:import (java.io File)))


(def item-price-data
  {
   (ds/opt :purchase_price) int?
   (ds/opt :sell_price) int?
   (ds/req :currency) currency-summary-spec
   (ds/req :version_group) version-group-summary-spec
   })

(def item-price-spec
  (ds/spec
    {:name ::item-price
     :spec item-price-data}))
