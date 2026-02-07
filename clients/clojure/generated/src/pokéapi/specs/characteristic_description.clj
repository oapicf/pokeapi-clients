(ns pokéapi.specs.characteristic-description
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def characteristic-description-data
  {
   (ds/opt :description) string?
   (ds/req :language) language-summary-spec
   })

(def characteristic-description-spec
  (ds/spec
    {:name ::characteristic-description
     :spec characteristic-description-data}))
