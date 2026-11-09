(ns pokéapi.specs.pokemon-sprites-other-official-artwork
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pokemon-sprites-other-official-artwork-data
  {
   (ds/req :front_default) string?
   (ds/req :front_shiny) string?
   (ds/opt :versions) (s/map-of string? (s/map-of string? any-type-spec))
   })

(def pokemon-sprites-other-official-artwork-spec
  (ds/spec
    {:name ::pokemon-sprites-other-official-artwork
     :spec pokemon-sprites-other-official-artwork-data}))
