(ns pokéapi.specs.characteristic-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def characteristic-summary-data
  {
   (ds/req :url) string?
   })

(def characteristic-summary-spec
  (ds/spec
    {:name ::characteristic-summary
     :spec characteristic-summary-data}))
