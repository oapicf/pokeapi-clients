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


import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../runtime';

export interface EvolutionTriggerListRequest {
    limit?: number;
    offset?: number;
}

export interface EvolutionTriggerReadRequest {
    id: number;
}


/**
 */
function evolutionTriggerListRaw<T>(requestParameters: EvolutionTriggerListRequest, requestConfig: runtime.TypedQueryConfig<T, string> = {}): QueryConfig<T> {
    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.limit !== undefined) {
        queryParameters['limit'] = requestParameters.limit;
    }


    if (requestParameters.offset !== undefined) {
        queryParameters['offset'] = requestParameters.offset;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/api/v2/evolution-trigger/`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        throw "OH NO";
    }

    return config;
}

/**
*/
export function evolutionTriggerList<T>(requestParameters: EvolutionTriggerListRequest, requestConfig?: runtime.TypedQueryConfig<T, string>): QueryConfig<T> {
    return evolutionTriggerListRaw(requestParameters, requestConfig);
}

/**
 */
function evolutionTriggerReadRaw<T>(requestParameters: EvolutionTriggerReadRequest, requestConfig: runtime.TypedQueryConfig<T, string> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling evolutionTriggerRead.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/api/v2/evolution-trigger/{id}/`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        throw "OH NO";
    }

    return config;
}

/**
*/
export function evolutionTriggerRead<T>(requestParameters: EvolutionTriggerReadRequest, requestConfig?: runtime.TypedQueryConfig<T, string>): QueryConfig<T> {
    return evolutionTriggerReadRaw(requestParameters, requestConfig);
}

