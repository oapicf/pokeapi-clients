(ns pokéapi.specs.berry-flavor-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def berry-flavor-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def berry-flavor-name-spec
  (ds/spec
    {:name ::berry-flavor-name
     :spec berry-flavor-name-data}))
