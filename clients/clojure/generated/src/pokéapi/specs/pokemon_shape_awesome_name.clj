(ns pokéapi.specs.pokemon-shape-awesome-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-shape-awesome-name-data
  {
   (ds/req :awesome_name) string?
   (ds/req :language) language-summary-spec
   })

(def pokemon-shape-awesome-name-spec
  (ds/spec
    {:name ::pokemon-shape-awesome-name
     :spec pokemon-shape-awesome-name-data}))
