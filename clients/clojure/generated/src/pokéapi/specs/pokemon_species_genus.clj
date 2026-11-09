(ns pokéapi.specs.pokemon-species-genus
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-species-genus-data
  {
   (ds/req :genus) string?
   (ds/req :language) language-summary-spec
   })

(def pokemon-species-genus-spec
  (ds/spec
    {:name ::pokemon-species-genus
     :spec pokemon-species-genus-data}))
