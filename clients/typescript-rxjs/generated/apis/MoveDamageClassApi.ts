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

export interface MoveDamageClassListRequest {
    limit?: number;
    offset?: number;
}

export interface MoveDamageClassReadRequest {
    id: number;
}

/**
 * no description
 */
export class MoveDamageClassApi extends BaseAPI {

    /**
     */
    moveDamageClassList({ limit, offset }: MoveDamageClassListRequest): Observable<string>
    moveDamageClassList({ limit, offset }: MoveDamageClassListRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    moveDamageClassList({ limit, offset }: MoveDamageClassListRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {

        const query: HttpQuery = {};

        if (limit != null) { query['limit'] = limit; }
        if (offset != null) { query['offset'] = offset; }

        return this.request<string>({
            url: '/api/v2/move-damage-class/',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     */
    moveDamageClassRead({ id }: MoveDamageClassReadRequest): Observable<string>
    moveDamageClassRead({ id }: MoveDamageClassReadRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    moveDamageClassRead({ id }: MoveDamageClassReadRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {
        throwIfNullOrUndefined(id, 'id', 'moveDamageClassRead');

        return this.request<string>({
            url: '/api/v2/move-damage-class/{id}/'.replace('{id}', encodeURI(id)),
            method: 'GET',
        }, opts?.responseOpts);
    };

}
