(ns pokéapi.specs.item-pocket-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def item-pocket-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def item-pocket-name-spec
  (ds/spec
    {:name ::item-pocket-name
     :spec item-pocket-name-data}))
