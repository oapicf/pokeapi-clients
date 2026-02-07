(ns pokéapi.specs.stat-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def stat-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def stat-name-spec
  (ds/spec
    {:name ::stat-name
     :spec stat-name-data}))
