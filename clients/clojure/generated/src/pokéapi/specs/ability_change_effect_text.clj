(ns pokéapi.specs.ability-change-effect-text
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def ability-change-effect-text-data
  {
   (ds/req :effect) string?
   (ds/req :language) language-summary-spec
   })

(def ability-change-effect-text-spec
  (ds/spec
    {:name ::ability-change-effect-text
     :spec ability-change-effect-text-data}))
