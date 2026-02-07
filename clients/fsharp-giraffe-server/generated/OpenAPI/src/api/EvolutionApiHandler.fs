namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open EvolutionApiHandlerParams
open EvolutionApiServiceInterface
open EvolutionApiServiceImplementation
open OpenAPI.Model.EvolutionChainDetail
open OpenAPI.Model.EvolutionTriggerDetail
open OpenAPI.Model.PaginatedEvolutionChainSummaryList
open OpenAPI.Model.PaginatedEvolutionTriggerSummaryList

module EvolutionApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region EvolutionChainList
    /// <summary>
    /// List evolution chains
    /// </summary>

    let EvolutionChainList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<EvolutionChainListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : EvolutionChainListArgs
          let result = EvolutionApiService.EvolutionChainList ctx serviceArgs
          return! (match result with
                      | EvolutionChainListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region EvolutionChainRetrieve
    /// <summary>
    /// Get evolution chain
    /// </summary>

    let EvolutionChainRetrieve (pathParams:EvolutionChainRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : EvolutionChainRetrieveArgs
          let result = EvolutionApiService.EvolutionChainRetrieve ctx serviceArgs
          return! (match result with
                      | EvolutionChainRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region EvolutionTriggerList
    /// <summary>
    /// List evolution triggers
    /// </summary>

    let EvolutionTriggerList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<EvolutionTriggerListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : EvolutionTriggerListArgs
          let result = EvolutionApiService.EvolutionTriggerList ctx serviceArgs
          return! (match result with
                      | EvolutionTriggerListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region EvolutionTriggerRetrieve
    /// <summary>
    /// Get evolution trigger
    /// </summary>

    let EvolutionTriggerRetrieve (pathParams:EvolutionTriggerRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : EvolutionTriggerRetrieveArgs
          let result = EvolutionApiService.EvolutionTriggerRetrieve ctx serviceArgs
          return! (match result with
                      | EvolutionTriggerRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

