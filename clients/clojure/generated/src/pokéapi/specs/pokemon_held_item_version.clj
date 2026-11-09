(ns pokéapi.specs.pokemon-held-item-version
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.version-summary :refer :all]
            )
  (:import (java.io File)))


(def pokemon-held-item-version-data
  {
   (ds/req :rarity) int?
   (ds/req :version) version-summary-spec
   })

(def pokemon-held-item-version-spec
  (ds/spec
    {:name ::pokemon-held-item-version
     :spec pokemon-held-item-version-data}))
