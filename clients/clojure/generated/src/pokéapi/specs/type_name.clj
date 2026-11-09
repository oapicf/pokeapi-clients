(ns pokéapi.specs.type-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def type-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def type-name-spec
  (ds/spec
    {:name ::type-name
     :spec type-name-data}))
