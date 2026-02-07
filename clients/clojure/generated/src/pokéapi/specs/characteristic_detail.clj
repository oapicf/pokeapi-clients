(ns pokéapi.specs.characteristic-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.stat-summary :refer :all]
            [pokéapi.specs.characteristic-description :refer :all]
            )
  (:import (java.io File)))


(def characteristic-detail-data
  {
   (ds/req :id) int?
   (ds/req :gene_modulo) int?
   (ds/req :possible_values) (s/coll-of int?)
   (ds/req :highest_stat) stat-summary-spec
   (ds/req :descriptions) (s/coll-of characteristic-description-spec)
   })

(def characteristic-detail-spec
  (ds/spec
    {:name ::characteristic-detail
     :spec characteristic-detail-data}))
