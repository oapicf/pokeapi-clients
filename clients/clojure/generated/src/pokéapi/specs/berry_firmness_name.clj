(ns pokéapi.specs.berry-firmness-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def berry-firmness-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def berry-firmness-name-spec
  (ds/spec
    {:name ::berry-firmness-name
     :spec berry-firmness-name-data}))
