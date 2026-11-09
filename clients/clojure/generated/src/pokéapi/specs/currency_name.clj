(ns pokéapi.specs.currency-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def currency-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def currency-name-spec
  (ds/spec
    {:name ::currency-name
     :spec currency-name-data}))
