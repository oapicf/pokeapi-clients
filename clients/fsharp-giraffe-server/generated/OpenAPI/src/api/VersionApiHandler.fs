namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open VersionApiHandlerParams
open VersionApiServiceInterface
open VersionApiServiceImplementation

module VersionApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region VersionList
    /// <summary>
    /// 
    /// </summary>

    let VersionList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<VersionListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : VersionListArgs
          let result = VersionApiService.VersionList ctx serviceArgs
          return! (match result with
                      | VersionListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region VersionRead
    /// <summary>
    /// 
    /// </summary>

    let VersionRead (pathParams:VersionReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : VersionReadArgs
          let result = VersionApiService.VersionRead ctx serviceArgs
          return! (match result with
                      | VersionReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

