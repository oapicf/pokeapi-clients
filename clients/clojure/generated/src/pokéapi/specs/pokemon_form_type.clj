(ns pokéapi.specs.pokemon-form-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.type-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-form-type-data
  {
   (ds/req :slot) int?
   (ds/req :type) type-summary-spec
   })

(def pokemon-form-type-spec
  (ds/spec
    {:name ::pokemon-form-type
     :spec pokemon-form-type-data}))
