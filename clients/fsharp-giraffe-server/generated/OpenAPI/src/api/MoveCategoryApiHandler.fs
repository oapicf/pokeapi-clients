namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open MoveCategoryApiHandlerParams
open MoveCategoryApiServiceInterface
open MoveCategoryApiServiceImplementation

module MoveCategoryApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region MoveCategoryList
    /// <summary>
    /// 
    /// </summary>

    let MoveCategoryList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MoveCategoryListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MoveCategoryListArgs
          let result = MoveCategoryApiService.MoveCategoryList ctx serviceArgs
          return! (match result with
                      | MoveCategoryListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveCategoryRead
    /// <summary>
    /// 
    /// </summary>

    let MoveCategoryRead (pathParams:MoveCategoryReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MoveCategoryReadArgs
          let result = MoveCategoryApiService.MoveCategoryRead ctx serviceArgs
          return! (match result with
                      | MoveCategoryReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

