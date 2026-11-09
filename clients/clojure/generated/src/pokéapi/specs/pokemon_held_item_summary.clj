(ns pokéapi.specs.pokemon-held-item-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.item-summary :refer :all]
            [pokéapi.specs.pokemon-held-item-version :refer :all]
            )
  (:import (java.io File)))


(def pokemon-held-item-summary-data
  {
   (ds/req :item) item-summary-spec
   (ds/req :version_details) (s/coll-of pokemon-held-item-version-spec)
   })

(def pokemon-held-item-summary-spec
  (ds/spec
    {:name ::pokemon-held-item-summary
     :spec pokemon-held-item-summary-data}))
