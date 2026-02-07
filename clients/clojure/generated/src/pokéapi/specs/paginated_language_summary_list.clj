(ns pokéapi.specs.paginated-language-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.language-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-language-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of language-summary-spec)
   })

(def paginated-language-summary-list-spec
  (ds/spec
    {:name ::paginated-language-summary-list
     :spec paginated-language-summary-list-data}))
