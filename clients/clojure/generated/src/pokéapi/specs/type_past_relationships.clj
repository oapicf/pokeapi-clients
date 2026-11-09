(ns pokéapi.specs.type-past-relationships
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.generation-summary :refer :all]
            [pokéapi.specs.type-relationships :refer :all]
            )
  (:import (java.io File)))


(def type-past-relationships-data
  {
   (ds/req :generation) generation-summary-spec
   (ds/req :damage_relations) type-relationships-spec
   })

(def type-past-relationships-spec
  (ds/spec
    {:name ::type-past-relationships
     :spec type-past-relationships-data}))
