(ns pokéapi.specs.pokemon-species-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-species-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def pokemon-species-name-spec
  (ds/spec
    {:name ::pokemon-species-name
     :spec pokemon-species-name-data}))
