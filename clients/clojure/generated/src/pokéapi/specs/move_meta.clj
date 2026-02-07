(ns pokéapi.specs.move-meta
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-meta-ailment-summary :refer :all]
            [pokéapi.specs.move-meta-category-summary :refer :all]
            )
  (:import (java.io File)))


(def move-meta-data
  {
   (ds/req :ailment) move-meta-ailment-summary-spec
   (ds/req :category) move-meta-category-summary-spec
   (ds/opt :min_hits) int?
   (ds/opt :max_hits) int?
   (ds/opt :min_turns) int?
   (ds/opt :max_turns) int?
   (ds/opt :drain) int?
   (ds/opt :healing) int?
   (ds/opt :crit_rate) int?
   (ds/opt :ailment_chance) int?
   (ds/opt :flinch_chance) int?
   (ds/opt :stat_chance) int?
   })

(def move-meta-spec
  (ds/spec
    {:name ::move-meta
     :spec move-meta-data}))
