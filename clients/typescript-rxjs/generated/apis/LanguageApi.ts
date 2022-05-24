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

export interface LanguageListRequest {
    limit?: number;
    offset?: number;
}

export interface LanguageReadRequest {
    id: number;
}

/**
 * no description
 */
export class LanguageApi extends BaseAPI {

    /**
     */
    languageList({ limit, offset }: LanguageListRequest): Observable<string>
    languageList({ limit, offset }: LanguageListRequest, opts?: OperationOpts): Observable<RawAjaxResponse<string>>
    languageList({ limit, offset }: LanguageListRequest, opts?: OperationOpts): Observable<string | RawAjaxResponse<string>> {

        const query: HttpQuery = {};

        if (limit != null) { query['limit'] = limit; }
        if (offset != null) { query['offset'] = offset; }

        return this.request<string>({
            url: '/api/v2/language/',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     */
    languageRead({ id }: LanguageReadRequest): Observable<string>
    languageRead({ id }: LanguageReadRequest, opts?: OperationOpts): Observable<RawAjaxResponse<string>>
    languageRead({ id }: LanguageReadRequest, opts?: OperationOpts): Observable<string | RawAjaxResponse<string>> {
        throwIfNullOrUndefined(id, 'id', 'languageRead');

        return this.request<string>({
            url: '/api/v2/language/{id}/'.replace('{id}', encodeURI(id)),
            method: 'GET',
        }, opts?.responseOpts);
    };

}
