(ns openapi-clj-client.api.language
  (:require [openapi-clj-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            )
  (:import (java.io File)))


(defn-spec language-list-with-http-info any?
  ""
  ([] (language-list-with-http-info nil))
  ([{:keys [limit offset]} (s/map-of keyword? any?)]
   (call-api "/api/v2/language/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset }
              :form-params   {}
              :content-types []
              :accepts       ["text/plain"]
              :auth-names    []})))

(defn-spec language-list string?
  ""
  ([] (language-list nil))
  ([optional-params any?]
   (let [res (:data (language-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec language-read-with-http-info any?
  ""
  [id int?]
  (check-required-params id)
  (call-api "/api/v2/language/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["text/plain"]
             :auth-names    []}))

(defn-spec language-read string?
  ""
  [id int?]
  (let [res (:data (language-read-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode string? res st/string-transformer)
       res)))


