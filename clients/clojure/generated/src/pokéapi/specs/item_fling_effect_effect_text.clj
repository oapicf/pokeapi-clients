(ns pokéapi.specs.item-fling-effect-effect-text
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def item-fling-effect-effect-text-data
  {
   (ds/req :effect) string?
   (ds/req :language) language-summary-spec
   })

(def item-fling-effect-effect-text-spec
  (ds/spec
    {:name ::item-fling-effect-effect-text
     :spec item-fling-effect-effect-text-data}))
