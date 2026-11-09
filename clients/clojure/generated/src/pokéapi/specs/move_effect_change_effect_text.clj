(ns pokéapi.specs.move-effect-change-effect-text
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def move-effect-change-effect-text-data
  {
   (ds/req :effect) string?
   (ds/req :language) language-summary-spec
   })

(def move-effect-change-effect-text-spec
  (ds/spec
    {:name ::move-effect-change-effect-text
     :spec move-effect-change-effect-text-data}))
