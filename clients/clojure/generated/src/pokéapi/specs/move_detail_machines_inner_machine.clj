(ns pokéapi.specs.move-detail-machines-inner-machine
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def move-detail-machines-inner-machine-data
  {
   (ds/req :url) string?
   })

(def move-detail-machines-inner-machine-spec
  (ds/spec
    {:name ::move-detail-machines-inner-machine
     :spec move-detail-machines-inner-machine-data}))
