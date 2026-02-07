(ns pokéapi.specs.ability-effect-text
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def ability-effect-text-data
  {
   (ds/req :effect) string?
   (ds/req :short_effect) string?
   (ds/req :language) language-summary-spec
   })

(def ability-effect-text-spec
  (ds/spec
    {:name ::ability-effect-text
     :spec ability-effect-text-data}))
