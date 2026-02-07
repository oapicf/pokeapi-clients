(ns pokéapi.specs.pokemon-species-description
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-species-description-data
  {
   (ds/opt :description) string?
   (ds/req :language) language-summary-spec
   })

(def pokemon-species-description-spec
  (ds/spec
    {:name ::pokemon-species-description
     :spec pokemon-species-description-data}))
