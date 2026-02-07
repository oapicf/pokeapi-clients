(ns pokéapi.specs.version-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def version-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def version-name-spec
  (ds/spec
    {:name ::version-name
     :spec version-name-data}))
