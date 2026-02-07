(ns pokéapi.specs.version-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.version-name :refer :all]
            [pokéapi.specs.version-group-summary :refer :all]
            )
  (:import (java.io File)))


(def version-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :names) (s/coll-of version-name-spec)
   (ds/req :version_group) version-group-summary-spec
   })

(def version-detail-spec
  (ds/spec
    {:name ::version-detail
     :spec version-detail-data}))
