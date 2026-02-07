(ns pokéapi.specs.pokedex-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def pokedex-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def pokedex-name-spec
  (ds/spec
    {:name ::pokedex-name
     :spec pokedex-name-data}))
