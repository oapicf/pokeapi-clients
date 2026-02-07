(ns pokéapi.specs.move-meta-category-description
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def move-meta-category-description-data
  {
   (ds/opt :description) string?
   (ds/req :language) language-summary-spec
   })

(def move-meta-category-description-spec
  (ds/spec
    {:name ::move-meta-category-description
     :spec move-meta-category-description-data}))
