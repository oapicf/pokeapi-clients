(ns pokéapi.specs.item-flavor-text
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.version-group-summary :refer :all]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def item-flavor-text-data
  {
   (ds/req :text) string?
   (ds/req :version_group) version-group-summary-spec
   (ds/req :language) language-summary-spec
   })

(def item-flavor-text-spec
  (ds/spec
    {:name ::item-flavor-text
     :spec item-flavor-text-data}))
