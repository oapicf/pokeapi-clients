(ns pokéapi.specs.pal-park-area-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def pal-park-area-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def pal-park-area-name-spec
  (ds/spec
    {:name ::pal-park-area-name
     :spec pal-park-area-name-data}))
