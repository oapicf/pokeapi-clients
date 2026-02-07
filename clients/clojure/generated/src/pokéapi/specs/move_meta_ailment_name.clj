(ns pokéapi.specs.move-meta-ailment-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def move-meta-ailment-name-data
  {
   (ds/req :name) string?
   (ds/req :language) language-summary-spec
   })

(def move-meta-ailment-name-spec
  (ds/spec
    {:name ::move-meta-ailment-name
     :spec move-meta-ailment-name-data}))
