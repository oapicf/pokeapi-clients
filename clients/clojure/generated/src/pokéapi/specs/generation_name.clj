(ns pokéapi.specs.generation-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def generation-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def generation-name-spec
  (ds/spec
    {:name ::generation-name
     :spec generation-name-data}))
