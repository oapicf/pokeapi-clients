(ns pokéapi.specs.stat-affecting-natures
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.nature-summary :refer :all]
            [pokéapi.specs.nature-summary :refer :all]
            )
  (:import (java.io File)))


(def stat-affecting-natures-data
  {
   (ds/req :increase) (s/coll-of nature-summary-spec)
   (ds/req :decrease) (s/coll-of nature-summary-spec)
   })

(def stat-affecting-natures-spec
  (ds/spec
    {:name ::stat-affecting-natures
     :spec stat-affecting-natures-data}))
