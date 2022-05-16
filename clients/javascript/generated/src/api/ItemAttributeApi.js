/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";

/**
* ItemAttribute service.
* @module api/ItemAttributeApi
* @version 1.0.0
*/
export default class ItemAttributeApi {

    /**
    * Constructs a new ItemAttributeApi. 
    * @alias module:api/ItemAttributeApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the itemAttributeList operation.
     * @callback module:api/ItemAttributeApi~itemAttributeListCallback
     * @param {String} error Error message, if any.
     * @param {String} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {Number} opts.limit 
     * @param {Number} opts.offset 
     * @param {module:api/ItemAttributeApi~itemAttributeListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link String}
     */
    itemAttributeList(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'limit': opts['limit'],
        'offset': opts['offset']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain'];
      let returnType = 'String';
      return this.apiClient.callApi(
        '/api/v2/item-attribute/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the itemAttributeRead operation.
     * @callback module:api/ItemAttributeApi~itemAttributeReadCallback
     * @param {String} error Error message, if any.
     * @param {String} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Number} id 
     * @param {module:api/ItemAttributeApi~itemAttributeReadCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link String}
     */
    itemAttributeRead(id, callback) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling itemAttributeRead");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain'];
      let returnType = 'String';
      return this.apiClient.callApi(
        '/api/v2/item-attribute/{id}/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
