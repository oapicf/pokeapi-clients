namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open StatApiHandlerParams
open StatApiServiceInterface
open StatApiServiceImplementation

module StatApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region StatList
    /// <summary>
    /// 
    /// </summary>

    let StatList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<StatListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : StatListArgs
          let result = StatApiService.StatList ctx serviceArgs
          return! (match result with
                      | StatListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region StatRead
    /// <summary>
    /// 
    /// </summary>

    let StatRead (pathParams:StatReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : StatReadArgs
          let result = StatApiService.StatRead ctx serviceArgs
          return! (match result with
                      | StatReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

