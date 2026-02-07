(ns pokéapi.specs.nature-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def nature-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def nature-summary-spec
  (ds/spec
    {:name ::nature-summary
     :spec nature-summary-data}))
