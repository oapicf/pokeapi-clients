(ns pokéapi.specs.contest-effect-effect-text
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def contest-effect-effect-text-data
  {
   (ds/req :effect) string?
   (ds/req :language) language-summary-spec
   })

(def contest-effect-effect-text-spec
  (ds/spec
    {:name ::contest-effect-effect-text
     :spec contest-effect-effect-text-data}))
