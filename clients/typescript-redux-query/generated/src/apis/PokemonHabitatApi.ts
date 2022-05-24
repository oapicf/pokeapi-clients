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


import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../runtime';

export interface PokemonHabitatListRequest {
    limit?: number;
    offset?: number;
}

export interface PokemonHabitatReadRequest {
    id: number;
}


/**
 */
function pokemonHabitatListRaw<T>(requestParameters: PokemonHabitatListRequest, requestConfig: runtime.TypedQueryConfig<T, string> = {}): QueryConfig<T> {
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
        url: `${runtime.Configuration.basePath}/api/v2/pokemon-habitat/`,
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
export function pokemonHabitatList<T>(requestParameters: PokemonHabitatListRequest, requestConfig?: runtime.TypedQueryConfig<T, string>): QueryConfig<T> {
    return pokemonHabitatListRaw(requestParameters, requestConfig);
}

/**
 */
function pokemonHabitatReadRaw<T>(requestParameters: PokemonHabitatReadRequest, requestConfig: runtime.TypedQueryConfig<T, string> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling pokemonHabitatRead.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/api/v2/pokemon-habitat/{id}/`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
export function pokemonHabitatRead<T>(requestParameters: PokemonHabitatReadRequest, requestConfig?: runtime.TypedQueryConfig<T, string>): QueryConfig<T> {
    return pokemonHabitatReadRaw(requestParameters, requestConfig);
}

