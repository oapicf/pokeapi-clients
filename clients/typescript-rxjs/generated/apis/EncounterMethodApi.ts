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

export interface EncounterMethodListRequest {
    limit?: number;
    offset?: number;
}

export interface EncounterMethodReadRequest {
    id: number;
}

/**
 * no description
 */
export class EncounterMethodApi extends BaseAPI {

    /**
     */
    encounterMethodList({ limit, offset }: EncounterMethodListRequest): Observable<string>
    encounterMethodList({ limit, offset }: EncounterMethodListRequest, opts?: OperationOpts): Observable<RawAjaxResponse<string>>
    encounterMethodList({ limit, offset }: EncounterMethodListRequest, opts?: OperationOpts): Observable<string | RawAjaxResponse<string>> {

        const query: HttpQuery = {};

        if (limit != null) { query['limit'] = limit; }
        if (offset != null) { query['offset'] = offset; }

        return this.request<string>({
            url: '/api/v2/encounter-method/',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     */
    encounterMethodRead({ id }: EncounterMethodReadRequest): Observable<string>
    encounterMethodRead({ id }: EncounterMethodReadRequest, opts?: OperationOpts): Observable<RawAjaxResponse<string>>
    encounterMethodRead({ id }: EncounterMethodReadRequest, opts?: OperationOpts): Observable<string | RawAjaxResponse<string>> {
        throwIfNullOrUndefined(id, 'id', 'encounterMethodRead');

        return this.request<string>({
            url: '/api/v2/encounter-method/{id}/'.replace('{id}', encodeURI(id)),
            method: 'GET',
        }, opts?.responseOpts);
    };

}
