(ns pokéapi.specs.ability-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def ability-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def ability-name-spec
  (ds/spec
    {:name ::ability-name
     :spec ability-name-data}))
