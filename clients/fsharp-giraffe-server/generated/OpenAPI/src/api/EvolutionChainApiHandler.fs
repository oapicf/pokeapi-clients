namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open EvolutionChainApiHandlerParams
open EvolutionChainApiServiceInterface
open EvolutionChainApiServiceImplementation

module EvolutionChainApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region EvolutionChainList
    /// <summary>
    /// 
    /// </summary>

    let EvolutionChainList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<EvolutionChainListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : EvolutionChainListArgs
          let result = EvolutionChainApiService.EvolutionChainList ctx serviceArgs
          return! (match result with
                      | EvolutionChainListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region EvolutionChainRead
    /// <summary>
    /// 
    /// </summary>

    let EvolutionChainRead (pathParams:EvolutionChainReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : EvolutionChainReadArgs
          let result = EvolutionChainApiService.EvolutionChainRead ctx serviceArgs
          return! (match result with
                      | EvolutionChainReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

