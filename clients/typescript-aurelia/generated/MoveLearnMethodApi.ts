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
 */

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
} from './models';

/**
 * moveLearnMethodList - parameters interface
 */
export interface IMoveLearnMethodListParams {
  limit?: number;
  offset?: number;
}

/**
 * moveLearnMethodRead - parameters interface
 */
export interface IMoveLearnMethodReadParams {
  id: number;
}

/**
 * MoveLearnMethodApi - API class
 */
@autoinject()
export class MoveLearnMethodApi extends Api {

  /**
   * Creates a new MoveLearnMethodApi class.
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
  async moveLearnMethodList(params: IMoveLearnMethodListParams): Promise<string> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/api/v2/move-learn-method/`;

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
  async moveLearnMethodRead(params: IMoveLearnMethodReadParams): Promise<string> {
    // Verify required parameters are set
    this.ensureParamIsSet('moveLearnMethodRead', params, 'id');

    // Create URL to call
    const url = `${this.basePath}/api/v2/move-learn-method/{id}/`
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

