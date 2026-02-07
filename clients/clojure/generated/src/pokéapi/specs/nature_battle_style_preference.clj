(ns pokéapi.specs.nature-battle-style-preference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-battle-style-summary :refer :all]
            )
  (:import (java.io File)))


(def nature-battle-style-preference-data
  {
   (ds/req :low_hp_preference) int?
   (ds/req :high_hp_preference) int?
   (ds/req :move_battle_style) move-battle-style-summary-spec
   })

(def nature-battle-style-preference-spec
  (ds/spec
    {:name ::nature-battle-style-preference
     :spec nature-battle-style-preference-data}))
