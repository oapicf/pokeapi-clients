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
 */

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
} from './models';

/**
 * growthRateList - parameters interface
 */
export interface IGrowthRateListParams {
  limit?: number;
  offset?: number;
}

/**
 * growthRateRead - parameters interface
 */
export interface IGrowthRateReadParams {
  id: number;
}

/**
 * GrowthRateApi - API class
 */
@autoinject()
export class GrowthRateApi extends Api {

  /**
   * Creates a new GrowthRateApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * @param params.limit 
   * @param params.offset 
   */
  async growthRateList(params: IGrowthRateListParams): Promise<string> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/api/v2/growth-rate/`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'limit': params['limit'],
        'offset': params['offset'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * @param params.id 
   */
  async growthRateRead(params: IGrowthRateReadParams): Promise<string> {
    // Verify required parameters are set
    this.ensureParamIsSet('growthRateRead', params, 'id');

    // Create URL to call
    const url = `${this.basePath}/api/v2/growth-rate/{id}/`
      .replace(`{${'id'}}`, encodeURIComponent(`${params['id']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}

