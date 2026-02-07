(ns pokéapi.specs.pokemon-form-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-summary :refer :all]
            [pokéapi.specs.pokemon-form-detail-sprites :refer :all]
            [pokéapi.specs.version-group-summary :refer :all]
            [pokéapi.specs.pokemon-form-detail-form-names-inner :refer :all]
            [pokéapi.specs.pokemon-form-detail-form-names-inner :refer :all]
            [pokéapi.specs.pokemon-detail-types-inner :refer :all]
            )
  (:import (java.io File)))


(def pokemon-form-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/opt :order) int?
   (ds/opt :form_order) int?
   (ds/opt :is_default) boolean?
   (ds/opt :is_battle_only) boolean?
   (ds/opt :is_mega) boolean?
   (ds/req :form_name) string?
   (ds/req :pokemon) pokemon-summary-spec
   (ds/req :sprites) pokemon-form-detail-sprites-spec
   (ds/req :version_group) version-group-summary-spec
   (ds/req :form_names) (s/coll-of pokemon-form-detail-form-names-inner-spec)
   (ds/req :names) (s/coll-of pokemon-form-detail-form-names-inner-spec)
   (ds/req :types) (s/coll-of pokemon-detail-types-inner-spec)
   })

(def pokemon-form-detail-spec
  (ds/spec
    {:name ::pokemon-form-detail
     :spec pokemon-form-detail-data}))
