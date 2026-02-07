(ns pokéapi.specs.contest-type-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def contest-type-name-data
  {
   (ds/req :name) string?
   (ds/req :color) string?
   (ds/req :language) language-summary-spec
   })

(def contest-type-name-spec
  (ds/spec
    {:name ::contest-type-name
     :spec contest-type-name-data}))
