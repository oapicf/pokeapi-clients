(ns pokéapi.specs.evolution-variable-description
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def evolution-variable-description-data
  {
   (ds/opt :description) string?
   (ds/req :language) language-summary-spec
   })

(def evolution-variable-description-spec
  (ds/spec
    {:name ::evolution-variable-description
     :spec evolution-variable-description-data}))
