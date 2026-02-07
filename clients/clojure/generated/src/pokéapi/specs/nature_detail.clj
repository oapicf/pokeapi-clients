(ns pokéapi.specs.nature-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.stat-summary :refer :all]
            [pokéapi.specs.stat-summary :refer :all]
            [pokéapi.specs.berry-flavor-summary :refer :all]
            [pokéapi.specs.berry-flavor-summary :refer :all]
            [pokéapi.specs.berry-summary :refer :all]
            [pokéapi.specs.nature-detail-pokeathlon-stat-changes-inner :refer :all]
            [pokéapi.specs.nature-battle-style-preference :refer :all]
            [pokéapi.specs.nature-name :refer :all]
            )
  (:import (java.io File)))


(def nature-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :decreased_stat) stat-summary-spec
   (ds/req :increased_stat) stat-summary-spec
   (ds/req :likes_flavor) berry-flavor-summary-spec
   (ds/req :hates_flavor) berry-flavor-summary-spec
   (ds/req :berries) (s/coll-of berry-summary-spec)
   (ds/req :pokeathlon_stat_changes) (s/coll-of nature-detail-pokeathlon-stat-changes-inner-spec)
   (ds/req :move_battle_style_preferences) (s/coll-of nature-battle-style-preference-spec)
   (ds/req :names) (s/coll-of nature-name-spec)
   })

(def nature-detail-spec
  (ds/spec
    {:name ::nature-detail
     :spec nature-detail-data}))
