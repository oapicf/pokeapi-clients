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

export interface PokemonShapeListRequest {
    limit?: number;
    offset?: number;
}

export interface PokemonShapeReadRequest {
    id: number;
}


/**
 */
function pokemonShapeListRaw<T>(requestParameters: PokemonShapeListRequest, requestConfig: runtime.TypedQueryConfig<T, string> = {}): QueryConfig<T> {
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
        url: `${runtime.Configuration.basePath}/api/v2/pokemon-shape/`,
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
export function pokemonShapeList<T>(requestParameters: PokemonShapeListRequest, requestConfig?: runtime.TypedQueryConfig<T, string>): QueryConfig<T> {
    return pokemonShapeListRaw(requestParameters, requestConfig);
}

/**
 */
function pokemonShapeReadRaw<T>(requestParameters: PokemonShapeReadRequest, requestConfig: runtime.TypedQueryConfig<T, string> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling pokemonShapeRead.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/api/v2/pokemon-shape/{id}/`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
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
export function pokemonShapeRead<T>(requestParameters: PokemonShapeReadRequest, requestConfig?: runtime.TypedQueryConfig<T, string>): QueryConfig<T> {
    return pokemonShapeReadRaw(requestParameters, requestConfig);
}

