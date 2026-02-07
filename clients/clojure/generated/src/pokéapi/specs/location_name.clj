(ns pokéapi.specs.location-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def location-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def location-name-spec
  (ds/spec
    {:name ::location-name
     :spec location-name-data}))
