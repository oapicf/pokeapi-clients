(ns pokéapi.specs.language-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def language-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def language-name-spec
  (ds/spec
    {:name ::language-name
     :spec language-name-data}))
