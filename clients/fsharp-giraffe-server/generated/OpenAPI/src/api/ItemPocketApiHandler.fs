namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ItemPocketApiHandlerParams
open ItemPocketApiServiceInterface
open ItemPocketApiServiceImplementation

module ItemPocketApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ItemPocketList
    /// <summary>
    /// 
    /// </summary>

    let ItemPocketList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemPocketListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ItemPocketListArgs
          let result = ItemPocketApiService.ItemPocketList ctx serviceArgs
          return! (match result with
                      | ItemPocketListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemPocketRead
    /// <summary>
    /// 
    /// </summary>

    let ItemPocketRead (pathParams:ItemPocketReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ItemPocketReadArgs
          let result = ItemPocketApiService.ItemPocketRead ctx serviceArgs
          return! (match result with
                      | ItemPocketReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

