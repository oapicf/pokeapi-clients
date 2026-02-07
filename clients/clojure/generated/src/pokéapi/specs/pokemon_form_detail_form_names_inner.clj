(ns pokéapi.specs.pokemon-form-detail-form-names-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def pokemon-form-detail-form-names-inner-data
  {
   (ds/req :language) ability-detail-pokemon-inner-pokemon-spec
   (ds/req :name) string?
   })

(def pokemon-form-detail-form-names-inner-spec
  (ds/spec
    {:name ::pokemon-form-detail-form-names-inner
     :spec pokemon-form-detail-form-names-inner-data}))
