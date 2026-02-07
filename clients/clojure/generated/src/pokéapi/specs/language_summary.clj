(ns pokéapi.specs.language-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def language-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def language-summary-spec
  (ds/spec
    {:name ::language-summary
     :spec language-summary-data}))
