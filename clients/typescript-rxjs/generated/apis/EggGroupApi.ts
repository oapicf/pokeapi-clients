// tslint:disable
/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type { Observable } from 'rxjs';
import type { AjaxResponse } from 'rxjs/ajax';
import { BaseAPI, throwIfNullOrUndefined, encodeURI } from '../runtime';
import type { OperationOpts, HttpQuery } from '../runtime';

export interface EggGroupListRequest {
    limit?: number;
    offset?: number;
}

export interface EggGroupReadRequest {
    id: number;
}

/**
 * no description
 */
export class EggGroupApi extends BaseAPI {

    /**
     */
    eggGroupList({ limit, offset }: EggGroupListRequest): Observable<string>
    eggGroupList({ limit, offset }: EggGroupListRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    eggGroupList({ limit, offset }: EggGroupListRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {

        const query: HttpQuery = {};

        if (limit != null) { query['limit'] = limit; }
        if (offset != null) { query['offset'] = offset; }

        return this.request<string>({
            url: '/api/v2/egg-group/',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     */
    eggGroupRead({ id }: EggGroupReadRequest): Observable<string>
    eggGroupRead({ id }: EggGroupReadRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    eggGroupRead({ id }: EggGroupReadRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {
        throwIfNullOrUndefined(id, 'id', 'eggGroupRead');

        return this.request<string>({
            url: '/api/v2/egg-group/{id}/'.replace('{id}', encodeURI(id)),
            method: 'GET',
        }, opts?.responseOpts);
    };

}