(ns pokéapi.specs.move-combos
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-combo-usage :refer :all]
            [pokéapi.specs.move-combo-usage :refer :all]
            )
  (:import (java.io File)))


(def move-combos-data
  {
   (ds/req :normal) move-combo-usage-spec
   (ds/req :super) move-combo-usage-spec
   })

(def move-combos-spec
  (ds/spec
    {:name ::move-combos
     :spec move-combos-data}))
