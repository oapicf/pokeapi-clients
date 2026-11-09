(ns pokéapi.specs.evolution-variable-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def evolution-variable-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def evolution-variable-name-spec
  (ds/spec
    {:name ::evolution-variable-name
     :spec evolution-variable-name-data}))
