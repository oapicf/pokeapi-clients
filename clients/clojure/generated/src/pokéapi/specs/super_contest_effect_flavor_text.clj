(ns pokéapi.specs.super-contest-effect-flavor-text
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def super-contest-effect-flavor-text-data
  {
   (ds/req :flavor_text) string?
   (ds/req :language) language-summary-spec
   })

(def super-contest-effect-flavor-text-spec
  (ds/spec
    {:name ::super-contest-effect-flavor-text
     :spec super-contest-effect-flavor-text-data}))
