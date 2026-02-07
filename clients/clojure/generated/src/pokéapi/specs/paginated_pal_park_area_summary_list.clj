(ns pokéapi.specs.paginated-pal-park-area-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.pal-park-area-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-pal-park-area-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of pal-park-area-summary-spec)
   })

(def paginated-pal-park-area-summary-list-spec
  (ds/spec
    {:name ::paginated-pal-park-area-summary-list
     :spec paginated-pal-park-area-summary-list-data}))
