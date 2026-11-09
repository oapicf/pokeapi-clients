(ns pokéapi.specs.pokemon-sprites-other-showdown
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-sprites-other-showdown-data
  {
   (ds/req :front_default) string?
   (ds/req :front_female) string?
   (ds/req :front_shiny) string?
   (ds/req :front_shiny_female) string?
   (ds/req :back_default) string?
   (ds/req :back_female) string?
   (ds/req :back_shiny) string?
   (ds/req :back_shiny_female) string?
   })

(def pokemon-sprites-other-showdown-spec
  (ds/spec
    {:name ::pokemon-sprites-other-showdown
     :spec pokemon-sprites-other-showdown-data}))
