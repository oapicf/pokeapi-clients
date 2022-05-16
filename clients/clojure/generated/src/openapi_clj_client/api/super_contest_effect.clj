(ns openapi-clj-client.api.super-contest-effect
  (:require [openapi-clj-client.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            )
  (:import (java.io File)))


(defn-spec super-contest-effect-list-with-http-info any?
  ""
  ([] (super-contest-effect-list-with-http-info nil))
  ([{:keys [limit offset]} (s/map-of keyword? any?)]
   (call-api "/api/v2/super-contest-effect/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "offset" offset }
              :form-params   {}
              :content-types []
              :accepts       ["text/plain"]
              :auth-names    []})))

(defn-spec super-contest-effect-list string?
  ""
  ([] (super-contest-effect-list nil))
  ([optional-params any?]
   (let [res (:data (super-contest-effect-list-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec super-contest-effect-read-with-http-info any?
  ""
  [id int?]
  (check-required-params id)
  (call-api "/api/v2/super-contest-effect/{id}/" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["text/plain"]
             :auth-names    []}))

(defn-spec super-contest-effect-read string?
  ""
  [id int?]
  (let [res (:data (super-contest-effect-read-with-http-info id))]
    (if (:decode-models *api-context*)
       (st/decode string? res st/string-transformer)
       res)))


