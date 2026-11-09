(ns pokéapi.specs.evolution-variable-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.version-group-summary :refer :all]
            [pokéapi.specs.evolution-variable-name :refer :all]
            [pokéapi.specs.evolution-variable-description :refer :all]
            )
  (:import (java.io File)))


(def evolution-variable-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :symbol) string?
   (ds/opt :data_type) string?
   (ds/opt :source) string?
   (ds/req :version_group) version-group-summary-spec
   (ds/req :names) (s/coll-of evolution-variable-name-spec)
   (ds/req :descriptions) (s/coll-of evolution-variable-description-spec)
   })

(def evolution-variable-detail-spec
  (ds/spec
    {:name ::evolution-variable-detail
     :spec evolution-variable-detail-data}))
