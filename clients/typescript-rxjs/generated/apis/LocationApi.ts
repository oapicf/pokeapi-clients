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

export interface LocationListRequest {
    limit?: number;
    offset?: number;
}

export interface LocationReadRequest {
    id: number;
}

/**
 * no description
 */
export class LocationApi extends BaseAPI {

    /**
     */
    locationList({ limit, offset }: LocationListRequest): Observable<string>
    locationList({ limit, offset }: LocationListRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    locationList({ limit, offset }: LocationListRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {

        const query: HttpQuery = {};

        if (limit != null) { query['limit'] = limit; }
        if (offset != null) { query['offset'] = offset; }

        return this.request<string>({
            url: '/api/v2/location/',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     */
    locationRead({ id }: LocationReadRequest): Observable<string>
    locationRead({ id }: LocationReadRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    locationRead({ id }: LocationReadRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {
        throwIfNullOrUndefined(id, 'id', 'locationRead');

        return this.request<string>({
            url: '/api/v2/location/{id}/'.replace('{id}', encodeURI(id)),
            method: 'GET',
        }, opts?.responseOpts);
    };

}
