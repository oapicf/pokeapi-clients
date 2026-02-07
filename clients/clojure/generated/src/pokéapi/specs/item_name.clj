(ns pokéapi.specs.item-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def item-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def item-name-spec
  (ds/spec
    {:name ::item-name
     :spec item-name-data}))
