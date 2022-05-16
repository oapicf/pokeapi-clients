namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ItemAttributeApiHandlerParams
open ItemAttributeApiServiceInterface
open ItemAttributeApiServiceImplementation

module ItemAttributeApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ItemAttributeList
    /// <summary>
    /// 
    /// </summary>

    let ItemAttributeList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemAttributeListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ItemAttributeListArgs
          let result = ItemAttributeApiService.ItemAttributeList ctx serviceArgs
          return! (match result with
                      | ItemAttributeListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemAttributeRead
    /// <summary>
    /// 
    /// </summary>

    let ItemAttributeRead (pathParams:ItemAttributeReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ItemAttributeReadArgs
          let result = ItemAttributeApiService.ItemAttributeRead ctx serviceArgs
          return! (match result with
                      | ItemAttributeReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

