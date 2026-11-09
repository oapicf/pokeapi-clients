(ns pokéapi.specs.pokemon-form-trigger-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-form-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-form-trigger-condition-data
  {
   (ds/req :trigger) string?
   (ds/opt :name) string?
   (ds/opt :url) string?
   (ds/opt :base_form) pokemon-form-summary-spec
   })

(def pokemon-form-trigger-condition-spec
  (ds/spec
    {:name ::pokemon-form-trigger-condition
     :spec pokemon-form-trigger-condition-data}))
