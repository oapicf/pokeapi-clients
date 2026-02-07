(ns pokéapi.specs.region-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def region-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def region-name-spec
  (ds/spec
    {:name ::region-name
     :spec region-name-data}))
