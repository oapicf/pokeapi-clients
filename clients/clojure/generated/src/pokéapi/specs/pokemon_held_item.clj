(ns pokéapi.specs.pokemon-held-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-summary :refer :all]
            [pokéapi.specs.pokemon-held-item-version :refer :all]
            )
  (:import (java.io File)))


(def pokemon-held-item-data
  {
   (ds/req :pokemon) pokemon-summary-spec
   (ds/req :version_details) (s/coll-of pokemon-held-item-version-spec)
   })

(def pokemon-held-item-spec
  (ds/spec
    {:name ::pokemon-held-item
     :spec pokemon-held-item-data}))
