(ns pokéapi.specs.pokemon-sprites-other
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pokemon-sprites-other-dream-world :refer :all]
            [pokéapi.specs.pokemon-sprites-other-home :refer :all]
            [pokéapi.specs.pokemon-sprites-other-showdown :refer :all]
            [pokéapi.specs.pokemon-sprites-other-official-artwork :refer :all]
            )
  (:import (java.io File)))


(def pokemon-sprites-other-data
  {
   (ds/opt :dream_world) pokemon-sprites-other-dream-world-spec
   (ds/opt :home) pokemon-sprites-other-home-spec
   (ds/opt :showdown) pokemon-sprites-other-showdown-spec
   (ds/opt :official-artwork) pokemon-sprites-other-official-artwork-spec
   })

(def pokemon-sprites-other-spec
  (ds/spec
    {:name ::pokemon-sprites-other
     :spec pokemon-sprites-other-data}))
