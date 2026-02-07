(ns pokéapi.specs.pokemon-color-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-color-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def pokemon-color-name-spec
  (ds/spec
    {:name ::pokemon-color-name
     :spec pokemon-color-name-data}))
