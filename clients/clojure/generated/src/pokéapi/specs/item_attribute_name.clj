(ns pokéapi.specs.item-attribute-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def item-attribute-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def item-attribute-name-spec
  (ds/spec
    {:name ::item-attribute-name
     :spec item-attribute-name-data}))
