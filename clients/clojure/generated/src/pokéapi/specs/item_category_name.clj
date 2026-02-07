(ns pokéapi.specs.item-category-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def item-category-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def item-category-name-spec
  (ds/spec
    {:name ::item-category-name
     :spec item-category-name-data}))
