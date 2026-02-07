(ns pokéapi.specs.pokemon-species-flavor-text
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            [pokéapi.specs.version-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-species-flavor-text-data
  {
   (ds/req :flavor_text) string?
   (ds/req :language) language-summary-spec
   (ds/req :version) version-summary-spec
   })

(def pokemon-species-flavor-text-spec
  (ds/spec
    {:name ::pokemon-species-flavor-text
     :spec pokemon-species-flavor-text-data}))
