(ns pokéapi.specs.pokemon-form-sprites
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-sprites-other :refer :all]
            )
  (:import (java.io File)))


(def pokemon-form-sprites-data
  {
   (ds/req :front_default) string?
   (ds/req :front_shiny) string?
   (ds/req :front_female) string?
   (ds/req :front_shiny_female) string?
   (ds/req :back_default) string?
   (ds/req :back_shiny) string?
   (ds/req :back_female) string?
   (ds/req :back_shiny_female) string?
   (ds/opt :other) pokemon-sprites-other-spec
   (ds/opt :versions) (s/map-of string? (s/map-of string? any-type-spec))
   })

(def pokemon-form-sprites-spec
  (ds/spec
    {:name ::pokemon-form-sprites
     :spec pokemon-form-sprites-data}))
