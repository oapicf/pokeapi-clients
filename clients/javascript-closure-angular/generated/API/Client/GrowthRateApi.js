/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.GrowthRateApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 * Version: 20220523
 * Generated by: org.openapitools.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.GrowthRateApi');


/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.GrowthRateApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('GrowthRateApiBasePath') ?
                   /** @type {!string} */ ($injector.get('GrowthRateApiBasePath')) :
                   'https://pokeapi.co';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('GrowthRateApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('GrowthRateApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.GrowthRateApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * 
 * 
 * @param {!number=} opt_limit 
 * @param {!number=} opt_offset 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.GrowthRateApi.prototype.growthRateList = function(opt_limit, opt_offset, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/api/v2/growth-rate/';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  if (opt_limit !== undefined) {
    queryParameters['limit'] = opt_limit;
  }

  if (opt_offset !== undefined) {
    queryParameters['offset'] = opt_offset;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * 
 * @param {!number} id 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.GrowthRateApi.prototype.growthRateRead = function(id, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/api/v2/growth-rate/{id}/'
      .replace('{' + 'id' + '}', String(id));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'id' is set
  if (!id) {
    throw new Error('Missing required parameter id when calling growthRateRead');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
