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

export interface ItemListRequest {
    limit?: number;
    offset?: number;
}

export interface ItemReadRequest {
    id: number;
}

/**
 * 
 */
export class ItemApi extends runtime.BaseAPI {

    /**
     */
    async itemListRaw(requestParameters: ItemListRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<string>> {
        const queryParameters: any = {};

        if (requestParameters.limit !== undefined) {
            queryParameters['limit'] = requestParameters.limit;
        }

        if (requestParameters.offset !== undefined) {
            queryParameters['offset'] = requestParameters.offset;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/api/v2/item/`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.TextApiResponse(response) as any;
    }

    /**
     */
    async itemList(requestParameters: ItemListRequest = {}, initOverrides?: RequestInit): Promise<string> {
        const response = await this.itemListRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     */
    async itemReadRaw(requestParameters: ItemReadRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<string>> {
        if (requestParameters.id === null || requestParameters.id === undefined) {
            throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling itemRead.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/api/v2/item/{id}/`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.TextApiResponse(response) as any;
    }

    /**
     */
    async itemRead(requestParameters: ItemReadRequest, initOverrides?: RequestInit): Promise<string> {
        const response = await this.itemReadRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
