(ns pokéapi.specs.paginated-move-meta-ailment-summary-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pokéapi.specs.move-meta-ailment-summary :refer :all]
            )
  (:import (java.io File)))


(def paginated-move-meta-ailment-summary-list-data
  {
   (ds/opt :count) int?
   (ds/opt :next) string?
   (ds/opt :previous) string?
   (ds/opt :results) (s/coll-of move-meta-ailment-summary-spec)
   })

(def paginated-move-meta-ailment-summary-list-spec
  (ds/spec
    {:name ::paginated-move-meta-ailment-summary-list
     :spec paginated-move-meta-ailment-summary-list-data}))
