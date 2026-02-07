(ns pokéapi.specs.type-detail-pokemon-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.type-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def type-detail-pokemon-inner-data
  {
   (ds/opt :slot) int?
   (ds/opt :pokemon) type-detail-pokemon-inner-pokemon-spec
   })

(def type-detail-pokemon-inner-spec
  (ds/spec
    {:name ::type-detail-pokemon-inner
     :spec type-detail-pokemon-inner-data}))
