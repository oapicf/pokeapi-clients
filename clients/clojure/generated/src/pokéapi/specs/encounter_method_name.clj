(ns pokéapi.specs.encounter-method-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def encounter-method-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def encounter-method-name-spec
  (ds/spec
    {:name ::encounter-method-name
     :spec encounter-method-name-data}))
