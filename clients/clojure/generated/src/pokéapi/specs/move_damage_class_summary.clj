(ns pokéapi.specs.move-damage-class-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def move-damage-class-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def move-damage-class-summary-spec
  (ds/spec
    {:name ::move-damage-class-summary
     :spec move-damage-class-summary-data}))
