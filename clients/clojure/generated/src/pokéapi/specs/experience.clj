(ns pokéapi.specs.experience
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def experience-data
  {
   (ds/req :level) int?
   (ds/req :experience) int?
   })

(def experience-spec
  (ds/spec
    {:name ::experience
     :spec experience-data}))
