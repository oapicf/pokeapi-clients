namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ItemApiHandlerParams
open ItemApiServiceInterface
open ItemApiServiceImplementation

module ItemApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ItemList
    /// <summary>
    /// 
    /// </summary>

    let ItemList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ItemListArgs
          let result = ItemApiService.ItemList ctx serviceArgs
          return! (match result with
                      | ItemListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemRead
    /// <summary>
    /// 
    /// </summary>

    let ItemRead (pathParams:ItemReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ItemReadArgs
          let result = ItemApiService.ItemRead ctx serviceArgs
          return! (match result with
                      | ItemReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

