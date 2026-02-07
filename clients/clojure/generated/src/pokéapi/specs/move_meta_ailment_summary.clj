(ns pokéapi.specs.move-meta-ailment-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def move-meta-ailment-summary-data
  {
   (ds/req :name) string?
   (ds/req :url) string?
   })

(def move-meta-ailment-summary-spec
  (ds/spec
    {:name ::move-meta-ailment-summary
     :spec move-meta-ailment-summary-data}))
