(ns pokéapi.specs.nature-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def nature-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def nature-name-spec
  (ds/spec
    {:name ::nature-name
     :spec nature-name-data}))
