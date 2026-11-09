(ns pokéapi.specs.pokemon-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.type-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-type-data
  {
   (ds/req :slot) int?
   (ds/req :type) type-summary-spec
   })

(def pokemon-type-spec
  (ds/spec
    {:name ::pokemon-type
     :spec pokemon-type-data}))
