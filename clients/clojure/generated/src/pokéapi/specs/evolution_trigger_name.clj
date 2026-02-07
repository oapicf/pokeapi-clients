(ns pokéapi.specs.evolution-trigger-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def evolution-trigger-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def evolution-trigger-name-spec
  (ds/spec
    {:name ::evolution-trigger-name
     :spec evolution-trigger-name-data}))
