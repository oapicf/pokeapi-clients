(ns pokéapi.specs.move-learn-method-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def move-learn-method-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def move-learn-method-name-spec
  (ds/spec
    {:name ::move-learn-method-name
     :spec move-learn-method-name-data}))
