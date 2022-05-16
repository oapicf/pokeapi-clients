namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ItemCategoryApiHandlerParams
open ItemCategoryApiServiceInterface
open ItemCategoryApiServiceImplementation

module ItemCategoryApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ItemCategoryList
    /// <summary>
    /// 
    /// </summary>

    let ItemCategoryList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemCategoryListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ItemCategoryListArgs
          let result = ItemCategoryApiService.ItemCategoryList ctx serviceArgs
          return! (match result with
                      | ItemCategoryListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemCategoryRead
    /// <summary>
    /// 
    /// </summary>

    let ItemCategoryRead (pathParams:ItemCategoryReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ItemCategoryReadArgs
          let result = ItemCategoryApiService.ItemCategoryRead ctx serviceArgs
          return! (match result with
                      | ItemCategoryReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

