(ns pokéapi.specs.super-contest-effect-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.super-contest-effect-flavor-text :refer :all]
            [pokéapi.specs.move-summary :refer :all]
            )
  (:import (java.io File)))


(def super-contest-effect-detail-data
  {
   (ds/req :id) int?
   (ds/req :appeal) int?
   (ds/req :flavor_text_entries) (s/coll-of super-contest-effect-flavor-text-spec)
   (ds/req :moves) (s/coll-of move-summary-spec)
   })

(def super-contest-effect-detail-spec
  (ds/spec
    {:name ::super-contest-effect-detail
     :spec super-contest-effect-detail-data}))
