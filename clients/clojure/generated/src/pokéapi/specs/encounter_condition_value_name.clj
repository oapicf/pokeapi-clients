(ns pokéapi.specs.encounter-condition-value-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def encounter-condition-value-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def encounter-condition-value-name-spec
  (ds/spec
    {:name ::encounter-condition-value-name
     :spec encounter-condition-value-name-data}))
