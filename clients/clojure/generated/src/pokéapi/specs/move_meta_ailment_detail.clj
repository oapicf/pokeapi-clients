(ns pokéapi.specs.move-meta-ailment-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            [pokéapi.specs.move-meta-ailment-name :refer :all]
            )
  (:import (java.io File)))


(def move-meta-ailment-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/req :moves) (s/coll-of ability-detail-pokemon-inner-pokemon-spec)
   (ds/req :names) (s/coll-of move-meta-ailment-name-spec)
   })

(def move-meta-ailment-detail-spec
  (ds/spec
    {:name ::move-meta-ailment-detail
     :spec move-meta-ailment-detail-data}))
