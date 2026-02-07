(ns pokéapi.specs.growth-rate-description
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def growth-rate-description-data
  {
   (ds/opt :description) string?
   (ds/req :language) language-summary-spec
   })

(def growth-rate-description-spec
  (ds/spec
    {:name ::growth-rate-description
     :spec growth-rate-description-data}))
