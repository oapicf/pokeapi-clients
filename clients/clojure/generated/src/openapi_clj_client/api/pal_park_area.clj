(ns openapi-clj-client.api.pal-park-area
  (:require [openapi-clj-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            )
  (:import (java.io File)))


(defn-spec pal-park-area-list-with-http-info any?
  ""
  ([] (pal-park-area-list-with-http-info nil))
  ([{:keys [limit offset]} (s/map-of keyword? any?)]
   (call-api "/api/v2/pal-park-area/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset }
              :form-params   {}
              :content-types []
              :accepts       ["text/plain"]
              :auth-names    []})))

(defn-spec pal-park-area-list string?
  ""
  ([] (pal-park-area-list nil))
  ([optional-params any?]
   (let [res (:data (pal-park-area-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec pal-park-area-read-with-http-info any?
  ""
  [id int?]
  (check-required-params id)
  (call-api "/api/v2/pal-park-area/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["text/plain"]
             :auth-names    []}))

(defn-spec pal-park-area-read string?
  ""
  [id int?]
  (let [res (:data (pal-park-area-read-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode string? res st/string-transformer)
       res)))


