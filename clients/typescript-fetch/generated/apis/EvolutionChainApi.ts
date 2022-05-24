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

export interface EvolutionChainListRequest {
    limit?: number;
    offset?: number;
}

export interface EvolutionChainReadRequest {
    id: number;
}

/**
 * 
 */
export class EvolutionChainApi extends runtime.BaseAPI {

    /**
     */
    async evolutionChainListRaw(requestParameters: EvolutionChainListRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<string>> {
        const queryParameters: any = {};

        if (requestParameters.limit !== undefined) {
            queryParameters['limit'] = requestParameters.limit;
        }

        if (requestParameters.offset !== undefined) {
            queryParameters['offset'] = requestParameters.offset;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/api/v2/evolution-chain/`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.TextApiResponse(response) as any;
    }

    /**
     */
    async evolutionChainList(requestParameters: EvolutionChainListRequest = {}, initOverrides?: RequestInit): Promise<string> {
        const response = await this.evolutionChainListRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     */
    async evolutionChainReadRaw(requestParameters: EvolutionChainReadRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<string>> {
        if (requestParameters.id === null || requestParameters.id === undefined) {
            throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling evolutionChainRead.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/api/v2/evolution-chain/{id}/`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.TextApiResponse(response) as any;
    }

    /**
     */
    async evolutionChainRead(requestParameters: EvolutionChainReadRequest, initOverrides?: RequestInit): Promise<string> {
        const response = await this.evolutionChainReadRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
