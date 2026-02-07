(ns pokéapi.specs.egg-group-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def egg-group-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def egg-group-name-spec
  (ds/spec
    {:name ::egg-group-name
     :spec egg-group-name-data}))
