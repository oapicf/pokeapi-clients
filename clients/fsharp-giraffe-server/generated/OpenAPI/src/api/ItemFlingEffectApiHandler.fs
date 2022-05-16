namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ItemFlingEffectApiHandlerParams
open ItemFlingEffectApiServiceInterface
open ItemFlingEffectApiServiceImplementation

module ItemFlingEffectApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ItemFlingEffectList
    /// <summary>
    /// 
    /// </summary>

    let ItemFlingEffectList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemFlingEffectListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ItemFlingEffectListArgs
          let result = ItemFlingEffectApiService.ItemFlingEffectList ctx serviceArgs
          return! (match result with
                      | ItemFlingEffectListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemFlingEffectRead
    /// <summary>
    /// 
    /// </summary>

    let ItemFlingEffectRead (pathParams:ItemFlingEffectReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ItemFlingEffectReadArgs
          let result = ItemFlingEffectApiService.ItemFlingEffectRead ctx serviceArgs
          return! (match result with
                      | ItemFlingEffectReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

