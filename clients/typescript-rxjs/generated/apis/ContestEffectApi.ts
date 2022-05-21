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

export interface ContestEffectListRequest {
    limit?: number;
    offset?: number;
}

export interface ContestEffectReadRequest {
    id: number;
}

/**
 * no description
 */
export class ContestEffectApi extends BaseAPI {

    /**
     */
    contestEffectList({ limit, offset }: ContestEffectListRequest): Observable<string>
    contestEffectList({ limit, offset }: ContestEffectListRequest, opts?: OperationOpts): Observable<RawAjaxResponse<string>>
    contestEffectList({ limit, offset }: ContestEffectListRequest, opts?: OperationOpts): Observable<string | RawAjaxResponse<string>> {

        const query: HttpQuery = {};

        if (limit != null) { query['limit'] = limit; }
        if (offset != null) { query['offset'] = offset; }

        return this.request<string>({
            url: '/api/v2/contest-effect/',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     */
    contestEffectRead({ id }: ContestEffectReadRequest): Observable<string>
    contestEffectRead({ id }: ContestEffectReadRequest, opts?: OperationOpts): Observable<RawAjaxResponse<string>>
    contestEffectRead({ id }: ContestEffectReadRequest, opts?: OperationOpts): Observable<string | RawAjaxResponse<string>> {
        throwIfNullOrUndefined(id, 'id', 'contestEffectRead');

        return this.request<string>({
            url: '/api/v2/contest-effect/{id}/'.replace('{id}', encodeURI(id)),
            method: 'GET',
        }, opts?.responseOpts);
    };

}