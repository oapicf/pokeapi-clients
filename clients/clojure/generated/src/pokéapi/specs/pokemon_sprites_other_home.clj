(ns pokéapi.specs.pokemon-sprites-other-home
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-sprites-other-home-data
  {
   (ds/req :front_default) string?
   (ds/req :front_female) string?
   (ds/req :front_shiny) string?
   (ds/req :front_shiny_female) string?
   })

(def pokemon-sprites-other-home-spec
  (ds/spec
    {:name ::pokemon-sprites-other-home
     :spec pokemon-sprites-other-home-data}))
