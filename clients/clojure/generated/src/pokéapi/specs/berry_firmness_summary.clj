(ns pokéapi.specs.berry-firmness-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def berry-firmness-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def berry-firmness-summary-spec
  (ds/spec
    {:name ::berry-firmness-summary
     :spec berry-firmness-summary-data}))
