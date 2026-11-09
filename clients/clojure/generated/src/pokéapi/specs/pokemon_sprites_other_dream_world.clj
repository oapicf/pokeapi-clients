(ns pokéapi.specs.pokemon-sprites-other-dream-world
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-sprites-other-dream-world-data
  {
   (ds/req :front_default) string?
   (ds/req :front_female) string?
   })

(def pokemon-sprites-other-dream-world-spec
  (ds/spec
    {:name ::pokemon-sprites-other-dream-world
     :spec pokemon-sprites-other-dream-world-data}))
