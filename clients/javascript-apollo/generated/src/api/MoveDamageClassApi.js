/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */



import ApiClient from "../ApiClient";

/**
* MoveDamageClass service.
* @module api/MoveDamageClassApi
* @version 20220523
*/
export default class MoveDamageClassApi extends ApiClient {

    /**
    * Constructs a new MoveDamageClassApi. 
    * @alias module:api/MoveDamageClassApi
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
    async moveDamageClassList(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'limit': opts['limit'],
        'offset': opts['offset']
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/20220523/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain'];
      let returnType = 'String';

      return this.callApi(
        '/api/v2/move-damage-class/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * @param {Number} id 
     * @return {Promise<String>}
     */
    async moveDamageClassRead(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling moveDamageClassRead");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/20220523/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain'];
      let returnType = 'String';

      return this.callApi(
        '/api/v2/move-damage-class/{id}/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


}
