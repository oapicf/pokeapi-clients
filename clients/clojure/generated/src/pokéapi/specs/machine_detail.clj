(ns pokéapi.specs.machine-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.item-summary :refer :all]
            [pokéapi.specs.version-group-summary :refer :all]
            [pokéapi.specs.move-summary :refer :all]
            )
  (:import (java.io File)))


(def machine-detail-data
  {
   (ds/req :id) int?
   (ds/req :item) item-summary-spec
   (ds/req :version_group) version-group-summary-spec
   (ds/req :move) move-summary-spec
   })

(def machine-detail-spec
  (ds/spec
    {:name ::machine-detail
     :spec machine-detail-data}))
