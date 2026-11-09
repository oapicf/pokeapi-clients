(ns pokéapi.specs.move-effect-effect-text
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def move-effect-effect-text-data
  {
   (ds/req :effect) string?
   (ds/req :short_effect) string?
   (ds/req :language) language-summary-spec
   })

(def move-effect-effect-text-spec
  (ds/spec
    {:name ::move-effect-effect-text
     :spec move-effect-effect-text-data}))
