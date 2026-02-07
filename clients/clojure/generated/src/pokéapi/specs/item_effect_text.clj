(ns pokéapi.specs.item-effect-text
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def item-effect-text-data
  {
   (ds/req :effect) string?
   (ds/req :short_effect) string?
   (ds/req :language) language-summary-spec
   })

(def item-effect-text-spec
  (ds/spec
    {:name ::item-effect-text
     :spec item-effect-text-data}))
