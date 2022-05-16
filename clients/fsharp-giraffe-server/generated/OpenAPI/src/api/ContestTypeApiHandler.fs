namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ContestTypeApiHandlerParams
open ContestTypeApiServiceInterface
open ContestTypeApiServiceImplementation

module ContestTypeApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ContestTypeList
    /// <summary>
    /// 
    /// </summary>

    let ContestTypeList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ContestTypeListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ContestTypeListArgs
          let result = ContestTypeApiService.ContestTypeList ctx serviceArgs
          return! (match result with
                      | ContestTypeListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region ContestTypeRead
    /// <summary>
    /// 
    /// </summary>

    let ContestTypeRead (pathParams:ContestTypeReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ContestTypeReadArgs
          let result = ContestTypeApiService.ContestTypeRead ctx serviceArgs
          return! (match result with
                      | ContestTypeReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

