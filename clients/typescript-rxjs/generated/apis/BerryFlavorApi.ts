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

export interface BerryFlavorListRequest {
    limit?: number;
    offset?: number;
}

export interface BerryFlavorReadRequest {
    id: number;
}

/**
 * no description
 */
export class BerryFlavorApi extends BaseAPI {

    /**
     */
    berryFlavorList({ limit, offset }: BerryFlavorListRequest): Observable<string>
    berryFlavorList({ limit, offset }: BerryFlavorListRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    berryFlavorList({ limit, offset }: BerryFlavorListRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {

        const query: HttpQuery = {};

        if (limit != null) { query['limit'] = limit; }
        if (offset != null) { query['offset'] = offset; }

        return this.request<string>({
            url: '/api/v2/berry-flavor/',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     */
    berryFlavorRead({ id }: BerryFlavorReadRequest): Observable<string>
    berryFlavorRead({ id }: BerryFlavorReadRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    berryFlavorRead({ id }: BerryFlavorReadRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {
        throwIfNullOrUndefined(id, 'id', 'berryFlavorRead');

        return this.request<string>({
            url: '/api/v2/berry-flavor/{id}/'.replace('{id}', encodeURI(id)),
            method: 'GET',
        }, opts?.responseOpts);
    };

}
