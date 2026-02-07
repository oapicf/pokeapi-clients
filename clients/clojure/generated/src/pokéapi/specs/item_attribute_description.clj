(ns pokéapi.specs.item-attribute-description
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def item-attribute-description-data
  {
   (ds/opt :description) string?
   (ds/req :language) language-summary-spec
   })

(def item-attribute-description-spec
  (ds/spec
    {:name ::item-attribute-description
     :spec item-attribute-description-data}))
