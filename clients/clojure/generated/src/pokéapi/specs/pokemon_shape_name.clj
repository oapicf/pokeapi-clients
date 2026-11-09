(ns pokéapi.specs.pokemon-shape-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-shape-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def pokemon-shape-name-spec
  (ds/spec
    {:name ::pokemon-shape-name
     :spec pokemon-shape-name-data}))
