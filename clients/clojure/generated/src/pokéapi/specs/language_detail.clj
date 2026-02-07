(ns pokéapi.specs.language-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-name :refer :all]
            )
  (:import (java.io File)))


(def language-detail-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/opt :official) boolean?
   (ds/req :iso639) string?
   (ds/req :iso3166) string?
   (ds/req :names) (s/coll-of language-name-spec)
   })

(def language-detail-spec
  (ds/spec
    {:name ::language-detail
     :spec language-detail-data}))
