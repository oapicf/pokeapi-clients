(ns pokéapi.specs.move-battle-style-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def move-battle-style-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def move-battle-style-name-spec
  (ds/spec
    {:name ::move-battle-style-name
     :spec move-battle-style-name-data}))
