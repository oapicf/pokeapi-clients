(ns pokéapi.specs.pokemon-habitat-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-habitat-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def pokemon-habitat-name-spec
  (ds/spec
    {:name ::pokemon-habitat-name
     :spec pokemon-habitat-name-data}))
