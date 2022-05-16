(ns openapi-clj-client.api.encounter-condition-value
  (:require [openapi-clj-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            )
  (:import (java.io File)))


(defn-spec encounter-condition-value-list-with-http-info any?
  ""
  ([] (encounter-condition-value-list-with-http-info nil))
  ([{:keys [limit offset]} (s/map-of keyword? any?)]
   (call-api "/api/v2/encounter-condition-value/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset }
              :form-params   {}
              :content-types []
              :accepts       ["text/plain"]
              :auth-names    []})))

(defn-spec encounter-condition-value-list string?
  ""
  ([] (encounter-condition-value-list nil))
  ([optional-params any?]
   (let [res (:data (encounter-condition-value-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec encounter-condition-value-read-with-http-info any?
  ""
  [id int?]
  (check-required-params id)
  (call-api "/api/v2/encounter-condition-value/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["text/plain"]
             :auth-names    []}))

(defn-spec encounter-condition-value-read string?
  ""
  [id int?]
  (let [res (:data (encounter-condition-value-read-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode string? res st/string-transformer)
       res)))


