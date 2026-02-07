(ns pokéapi.specs.move-target-description
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def move-target-description-data
  {
   (ds/opt :description) string?
   (ds/req :language) language-summary-spec
   })

(def move-target-description-spec
  (ds/spec
    {:name ::move-target-description
     :spec move-target-description-data}))
