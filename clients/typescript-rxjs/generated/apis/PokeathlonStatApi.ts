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

export interface PokeathlonStatListRequest {
    limit?: number;
    offset?: number;
}

export interface PokeathlonStatReadRequest {
    id: number;
}

/**
 * no description
 */
export class PokeathlonStatApi extends BaseAPI {

    /**
     */
    pokeathlonStatList({ limit, offset }: PokeathlonStatListRequest): Observable<string>
    pokeathlonStatList({ limit, offset }: PokeathlonStatListRequest, opts?: OperationOpts): Observable<RawAjaxResponse<string>>
    pokeathlonStatList({ limit, offset }: PokeathlonStatListRequest, opts?: OperationOpts): Observable<string | RawAjaxResponse<string>> {

        const query: HttpQuery = {};

        if (limit != null) { query['limit'] = limit; }
        if (offset != null) { query['offset'] = offset; }

        return this.request<string>({
            url: '/api/v2/pokeathlon-stat/',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     */
    pokeathlonStatRead({ id }: PokeathlonStatReadRequest): Observable<string>
    pokeathlonStatRead({ id }: PokeathlonStatReadRequest, opts?: OperationOpts): Observable<RawAjaxResponse<string>>
    pokeathlonStatRead({ id }: PokeathlonStatReadRequest, opts?: OperationOpts): Observable<string | RawAjaxResponse<string>> {
        throwIfNullOrUndefined(id, 'id', 'pokeathlonStatRead');

        return this.request<string>({
            url: '/api/v2/pokeathlon-stat/{id}/'.replace('{id}', encodeURI(id)),
            method: 'GET',
        }, opts?.responseOpts);
    };

}