(ns pokéapi.specs.move-learn-method-description
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def move-learn-method-description-data
  {
   (ds/opt :description) string?
   (ds/req :language) language-summary-spec
   })

(def move-learn-method-description-spec
  (ds/spec
    {:name ::move-learn-method-description
     :spec move-learn-method-description-data}))
