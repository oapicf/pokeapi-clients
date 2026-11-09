(ns pokéapi.specs.pokemon-form-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-summary :refer :all]
            [pokéapi.specs.pokemon-form-sprites :refer :all]
            [pokéapi.specs.version-group-summary :refer :all]
            [pokéapi.specs.pokemon-form-name :refer :all]
            [pokéapi.specs.pokemon-form-name :refer :all]
            [pokéapi.specs.pokemon-form-type :refer :all]
            [pokéapi.specs.pokemon-form-trigger-condition :refer :all]
            [pokéapi.specs.pokemon-form-flavor-text :refer :all]
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
   (ds/req :sprites) pokemon-form-sprites-spec
   (ds/req :version_group) version-group-summary-spec
   (ds/req :form_names) (s/coll-of pokemon-form-name-spec)
   (ds/req :names) (s/coll-of pokemon-form-name-spec)
   (ds/req :types) (s/coll-of pokemon-form-type-spec)
   (ds/req :trigger_conditions) (s/coll-of pokemon-form-trigger-condition-spec)
   (ds/req :flavor_text_entries) (s/coll-of pokemon-form-flavor-text-spec)
   })

(def pokemon-form-detail-spec
  (ds/spec
    {:name ::pokemon-form-detail
     :spec pokemon-form-detail-data}))
