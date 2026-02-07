(ns pokéapi.specs.move-target-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def move-target-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def move-target-name-spec
  (ds/spec
    {:name ::move-target-name
     :spec move-target-name-data}))
