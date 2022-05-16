// tslint:disable
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

import { Observable } from 'rxjs';
import { BaseAPI, HttpQuery, throwIfNullOrUndefined, encodeURI, OperationOpts, RawAjaxResponse } from '../runtime';

export interface StatListRequest {
    limit?: number;
    offset?: number;
}

export interface StatReadRequest {
    id: number;
}

/**
 * no description
 */
export class StatApi extends BaseAPI {

    /**
     */
    statList({ limit, offset }: StatListRequest): Observable<string>
    statList({ limit, offset }: StatListRequest, opts?: OperationOpts): Observable<RawAjaxResponse<string>>
    statList({ limit, offset }: StatListRequest, opts?: OperationOpts): Observable<string | RawAjaxResponse<string>> {

        const query: HttpQuery = {};

        if (limit != null) { query['limit'] = limit; }
        if (offset != null) { query['offset'] = offset; }

        return this.request<string>({
            url: '/api/v2/stat/',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     */
    statRead({ id }: StatReadRequest): Observable<string>
    statRead({ id }: StatReadRequest, opts?: OperationOpts): Observable<RawAjaxResponse<string>>
    statRead({ id }: StatReadRequest, opts?: OperationOpts): Observable<string | RawAjaxResponse<string>> {
        throwIfNullOrUndefined(id, 'id', 'statRead');

        return this.request<string>({
            url: '/api/v2/stat/{id}/'.replace('{id}', encodeURI(id)),
            method: 'GET',
        }, opts?.responseOpts);
    };

}
