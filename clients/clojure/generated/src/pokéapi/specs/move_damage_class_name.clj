(ns pokéapi.specs.move-damage-class-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def move-damage-class-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def move-damage-class-name-spec
  (ds/spec
    {:name ::move-damage-class-name
     :spec move-damage-class-name-data}))
