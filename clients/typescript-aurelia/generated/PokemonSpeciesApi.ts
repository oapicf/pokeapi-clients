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
 * pokemonSpeciesList - parameters interface
 */
export interface IPokemonSpeciesListParams {
  limit?: number;
  offset?: number;
}

/**
 * pokemonSpeciesRead - parameters interface
 */
export interface IPokemonSpeciesReadParams {
  id: number;
}

/**
 * PokemonSpeciesApi - API class
 */
@autoinject()
export class PokemonSpeciesApi extends Api {

  /**
   * Creates a new PokemonSpeciesApi class.
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
  async pokemonSpeciesList(params: IPokemonSpeciesListParams): Promise<string> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/api/v2/pokemon-species/`;

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
  async pokemonSpeciesRead(params: IPokemonSpeciesReadParams): Promise<string> {
    // Verify required parameters are set
    this.ensureParamIsSet('pokemonSpeciesRead', params, 'id');

    // Create URL to call
    const url = `${this.basePath}/api/v2/pokemon-species/{id}/`
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

