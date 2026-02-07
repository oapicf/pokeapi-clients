(ns pokéapi.specs.move-damage-class-description
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def move-damage-class-description-data
  {
   (ds/opt :description) string?
   (ds/req :language) language-summary-spec
   })

(def move-damage-class-description-spec
  (ds/spec
    {:name ::move-damage-class-description
     :spec move-damage-class-description-data}))
