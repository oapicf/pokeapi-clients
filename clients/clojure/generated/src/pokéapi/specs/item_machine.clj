(ns pokéapi.specs.item-machine
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.machine-summary :refer :all]
            [pokéapi.specs.version-group-summary :refer :all]
            )
  (:import (java.io File)))


(def item-machine-data
  {
   (ds/req :machine) machine-summary-spec
   (ds/req :version_group) version-group-summary-spec
   })

(def item-machine-spec
  (ds/spec
    {:name ::item-machine
     :spec item-machine-data}))
