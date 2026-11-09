(ns pokéapi.specs.pokemon-form-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-form-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def pokemon-form-name-spec
  (ds/spec
    {:name ::pokemon-form-name
     :spec pokemon-form-name-data}))
