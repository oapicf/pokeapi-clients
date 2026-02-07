(ns pokéapi.specs.ability-flavor-text
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            [pokéapi.specs.version-group-summary :refer :all]
            )
  (:import (java.io File)))


(def ability-flavor-text-data
  {
   (ds/req :flavor_text) string?
   (ds/req :language) language-summary-spec
   (ds/req :version_group) version-group-summary-spec
   })

(def ability-flavor-text-spec
  (ds/spec
    {:name ::ability-flavor-text
     :spec ability-flavor-text-data}))
