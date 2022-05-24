// tslint:disable
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

import { Observable } from 'rxjs';
import { BaseAPI, HttpQuery, throwIfNullOrUndefined, encodeURI, OperationOpts, RawAjaxResponse } from '../runtime';

export interface LocationAreaListRequest {
    limit?: number;
    offset?: number;
}

export interface LocationAreaReadRequest {
    id: number;
}

/**
 * no description
 */
export class LocationAreaApi extends BaseAPI {

    /**
     */
    locationAreaList({ limit, offset }: LocationAreaListRequest): Observable<string>
    locationAreaList({ limit, offset }: LocationAreaListRequest, opts?: OperationOpts): Observable<RawAjaxResponse<string>>
    locationAreaList({ limit, offset }: LocationAreaListRequest, opts?: OperationOpts): Observable<string | RawAjaxResponse<string>> {

        const query: HttpQuery = {};

        if (limit != null) { query['limit'] = limit; }
        if (offset != null) { query['offset'] = offset; }

        return this.request<string>({
            url: '/api/v2/location-area/',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     */
    locationAreaRead({ id }: LocationAreaReadRequest): Observable<string>
    locationAreaRead({ id }: LocationAreaReadRequest, opts?: OperationOpts): Observable<RawAjaxResponse<string>>
    locationAreaRead({ id }: LocationAreaReadRequest, opts?: OperationOpts): Observable<string | RawAjaxResponse<string>> {
        throwIfNullOrUndefined(id, 'id', 'locationAreaRead');

        return this.request<string>({
            url: '/api/v2/location-area/{id}/'.replace('{id}', encodeURI(id)),
            method: 'GET',
        }, opts?.responseOpts);
    };

}
