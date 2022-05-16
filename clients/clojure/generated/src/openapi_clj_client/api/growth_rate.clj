(ns openapi-clj-client.api.growth-rate
  (:require [openapi-clj-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            )
  (:import (java.io File)))


(defn-spec growth-rate-list-with-http-info any?
  ""
  ([] (growth-rate-list-with-http-info nil))
  ([{:keys [limit offset]} (s/map-of keyword? any?)]
   (call-api "/api/v2/growth-rate/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset }
              :form-params   {}
              :content-types []
              :accepts       ["text/plain"]
              :auth-names    []})))

(defn-spec growth-rate-list string?
  ""
  ([] (growth-rate-list nil))
  ([optional-params any?]
   (let [res (:data (growth-rate-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec growth-rate-read-with-http-info any?
  ""
  [id int?]
  (check-required-params id)
  (call-api "/api/v2/growth-rate/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["text/plain"]
             :auth-names    []}))

(defn-spec growth-rate-read string?
  ""
  [id int?]
  (let [res (:data (growth-rate-read-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode string? res st/string-transformer)
       res)))


