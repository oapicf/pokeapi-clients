(ns pokéapi.specs.pokemon-shape-detail-awesome-names-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.ability-detail-pokemon-inner-pokemon :refer :all]
            )
  (:import (java.io File)))


(def pokemon-shape-detail-awesome-names-inner-data
  {
   (ds/req :awesome_name) string?
   (ds/req :language) ability-detail-pokemon-inner-pokemon-spec
   })

(def pokemon-shape-detail-awesome-names-inner-spec
  (ds/spec
    {:name ::pokemon-shape-detail-awesome-names-inner
     :spec pokemon-shape-detail-awesome-names-inner-data}))
