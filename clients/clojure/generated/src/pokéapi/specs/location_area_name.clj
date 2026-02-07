(ns pokéapi.specs.location-area-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def location-area-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def location-area-name-spec
  (ds/spec
    {:name ::location-area-name
     :spec location-area-name-data}))
