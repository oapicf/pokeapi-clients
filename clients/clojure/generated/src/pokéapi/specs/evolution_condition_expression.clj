(ns pokéapi.specs.evolution-condition-expression
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.evolution-variable-summary :refer :all]
            )
  (:import (java.io File)))


(def evolution-condition-expression-data
  {
   (ds/req :expression) string?
   (ds/req :percentage_chance) float?
   (ds/req :variables) (s/coll-of evolution-variable-summary-spec)
   })

(def evolution-condition-expression-spec
  (ds/spec
    {:name ::evolution-condition-expression
     :spec evolution-condition-expression-data}))
