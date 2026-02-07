(ns pokéapi.specs.move-battle-style-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def move-battle-style-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def move-battle-style-summary-spec
  (ds/spec
    {:name ::move-battle-style-summary
     :spec move-battle-style-summary-data}))
