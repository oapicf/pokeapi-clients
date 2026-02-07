(ns pokéapi.specs.contest-effect-flavor-text
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def contest-effect-flavor-text-data
  {
   (ds/req :flavor_text) string?
   (ds/req :language) language-summary-spec
   })

(def contest-effect-flavor-text-spec
  (ds/spec
    {:name ::contest-effect-flavor-text
     :spec contest-effect-flavor-text-data}))
