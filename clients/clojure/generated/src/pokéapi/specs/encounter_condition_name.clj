(ns pokéapi.specs.encounter-condition-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def encounter-condition-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def encounter-condition-name-spec
  (ds/spec
    {:name ::encounter-condition-name
     :spec encounter-condition-name-data}))
