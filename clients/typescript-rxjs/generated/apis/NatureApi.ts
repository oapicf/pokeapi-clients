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

export interface NatureListRequest {
    limit?: number;
    offset?: number;
}

export interface NatureReadRequest {
    id: number;
}

/**
 * no description
 */
export class NatureApi extends BaseAPI {

    /**
     */
    natureList({ limit, offset }: NatureListRequest): Observable<string>
    natureList({ limit, offset }: NatureListRequest, opts?: OperationOpts): Observable<RawAjaxResponse<string>>
    natureList({ limit, offset }: NatureListRequest, opts?: OperationOpts): Observable<string | RawAjaxResponse<string>> {

        const query: HttpQuery = {};

        if (limit != null) { query['limit'] = limit; }
        if (offset != null) { query['offset'] = offset; }

        return this.request<string>({
            url: '/api/v2/nature/',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     */
    natureRead({ id }: NatureReadRequest): Observable<string>
    natureRead({ id }: NatureReadRequest, opts?: OperationOpts): Observable<RawAjaxResponse<string>>
    natureRead({ id }: NatureReadRequest, opts?: OperationOpts): Observable<string | RawAjaxResponse<string>> {
        throwIfNullOrUndefined(id, 'id', 'natureRead');

        return this.request<string>({
            url: '/api/v2/nature/{id}/'.replace('{id}', encodeURI(id)),
            method: 'GET',
        }, opts?.responseOpts);
    };

}