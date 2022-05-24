/* tslint:disable */
/* eslint-disable */
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


import * as runtime from '../runtime';

export interface PokedexListRequest {
    limit?: number;
    offset?: number;
}

export interface PokedexReadRequest {
    id: number;
}

/**
 * 
 */
export class PokedexApi extends runtime.BaseAPI {

    /**
     */
    async pokedexListRaw(requestParameters: PokedexListRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<string>> {
        const queryParameters: any = {};

        if (requestParameters.limit !== undefined) {
            queryParameters['limit'] = requestParameters.limit;
        }

        if (requestParameters.offset !== undefined) {
            queryParameters['offset'] = requestParameters.offset;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/api/v2/pokedex/`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.TextApiResponse(response) as any;
    }

    /**
     */
    async pokedexList(requestParameters: PokedexListRequest = {}, initOverrides?: RequestInit): Promise<string> {
        const response = await this.pokedexListRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     */
    async pokedexReadRaw(requestParameters: PokedexReadRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<string>> {
        if (requestParameters.id === null || requestParameters.id === undefined) {
            throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling pokedexRead.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/api/v2/pokedex/{id}/`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.TextApiResponse(response) as any;
    }

    /**
     */
    async pokedexRead(requestParameters: PokedexReadRequest, initOverrides?: RequestInit): Promise<string> {
        const response = await this.pokedexReadRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
