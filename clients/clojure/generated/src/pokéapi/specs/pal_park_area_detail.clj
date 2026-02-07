(ns pokéapi.specs.pal-park-area-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pal-park-area-name :refer :all]
            [pokéapi.specs.pal-park-area-detail-pokemon-encounters-inner :refer :all]
            )
  (:import (java.io File)))


(def pal-park-area-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :names) (s/coll-of pal-park-area-name-spec)
   (ds/req :pokemon_encounters) (s/coll-of pal-park-area-detail-pokemon-encounters-inner-spec)
   })

(def pal-park-area-detail-spec
  (ds/spec
    {:name ::pal-park-area-detail
     :spec pal-park-area-detail-data}))
