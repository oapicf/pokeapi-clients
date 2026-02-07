(ns pokéapi.specs.pokedex-description
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def pokedex-description-data
  {
   (ds/opt :description) string?
   (ds/req :language) language-summary-spec
   })

(def pokedex-description-spec
  (ds/spec
    {:name ::pokedex-description
     :spec pokedex-description-data}))
