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
* MoveCategory service.
* @module api/MoveCategoryApi
* @version 1.0.0
*/
export default class MoveCategoryApi extends ApiClient {

    /**
    * Constructs a new MoveCategoryApi. 
    * @alias module:api/MoveCategoryApi
    * @class
    */
    constructor() {
      super();
      this.baseURL = null;
    }


    /**
     * @param {Object} opts Optional parameters
     * @param {Number} opts.limit 
     * @param {Number} opts.offset 
     * @return {Promise<String>}
     */
    async moveCategoryList(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'limit': opts['limit'],
        'offset': opts['offset']
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain'];
      let returnType = 'String';

      return this.callApi(
        '/api/v2/move-category/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * @param {Number} id 
     * @return {Promise<String>}
     */
    async moveCategoryRead(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling moveCategoryRead");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain'];
      let returnType = 'String';

      return this.callApi(
        '/api/v2/move-category/{id}/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


}
