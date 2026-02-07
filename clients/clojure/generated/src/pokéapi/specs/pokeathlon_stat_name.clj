(ns pokéapi.specs.pokeathlon-stat-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def pokeathlon-stat-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def pokeathlon-stat-name-spec
  (ds/spec
    {:name ::pokeathlon-stat-name
     :spec pokeathlon-stat-name-data}))
