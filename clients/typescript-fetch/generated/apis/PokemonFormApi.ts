/* tslint:disable */
/* eslint-disable */
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


import * as runtime from '../runtime';

export interface PokemonFormListRequest {
    limit?: number;
    offset?: number;
}

export interface PokemonFormReadRequest {
    id: number;
}

/**
 * 
 */
export class PokemonFormApi extends runtime.BaseAPI {

    /**
     */
    async pokemonFormListRaw(requestParameters: PokemonFormListRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<string>> {
        const queryParameters: any = {};

        if (requestParameters.limit !== undefined) {
            queryParameters['limit'] = requestParameters.limit;
        }

        if (requestParameters.offset !== undefined) {
            queryParameters['offset'] = requestParameters.offset;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/api/v2/pokemon-form/`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.TextApiResponse(response) as any;
    }

    /**
     */
    async pokemonFormList(requestParameters: PokemonFormListRequest = {}, initOverrides?: RequestInit): Promise<string> {
        const response = await this.pokemonFormListRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     */
    async pokemonFormReadRaw(requestParameters: PokemonFormReadRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<string>> {
        if (requestParameters.id === null || requestParameters.id === undefined) {
            throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling pokemonFormRead.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/api/v2/pokemon-form/{id}/`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.TextApiResponse(response) as any;
    }

    /**
     */
    async pokemonFormRead(requestParameters: PokemonFormReadRequest, initOverrides?: RequestInit): Promise<string> {
        const response = await this.pokemonFormReadRaw(requestParameters, initOverrides);
        return await response.value();
    }

}