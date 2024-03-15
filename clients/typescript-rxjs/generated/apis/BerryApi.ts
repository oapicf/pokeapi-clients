// tslint:disable
/**
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type { Observable } from 'rxjs';
import type { AjaxResponse } from 'rxjs/ajax';
import { BaseAPI, throwIfNullOrUndefined, encodeURI } from '../runtime';
import type { OperationOpts, HttpQuery } from '../runtime';

export interface BerryListRequest {
    limit?: number;
    offset?: number;
}

export interface BerryReadRequest {
    id: number;
}

/**
 * no description
 */
export class BerryApi extends BaseAPI {

    /**
     */
    berryList({ limit, offset }: BerryListRequest): Observable<string>
    berryList({ limit, offset }: BerryListRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    berryList({ limit, offset }: BerryListRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {

        const query: HttpQuery = {};

        if (limit != null) { query['limit'] = limit; }
        if (offset != null) { query['offset'] = offset; }

        return this.request<string>({
            url: '/api/v2/berry/',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     */
    berryRead({ id }: BerryReadRequest): Observable<string>
    berryRead({ id }: BerryReadRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    berryRead({ id }: BerryReadRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {
        throwIfNullOrUndefined(id, 'id', 'berryRead');

        return this.request<string>({
            url: '/api/v2/berry/{id}/'.replace('{id}', encodeURI(id)),
            method: 'GET',
        }, opts?.responseOpts);
    };

}
