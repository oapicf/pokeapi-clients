(ns pokéapi.specs.pal-park-area-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pal-park-area-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def pal-park-area-summary-spec
  (ds/spec
    {:name ::pal-park-area-summary
     :spec pal-park-area-summary-data}))
