namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open VersionGroupApiHandlerParams
open VersionGroupApiServiceInterface
open VersionGroupApiServiceImplementation

module VersionGroupApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region VersionGroupList
    /// <summary>
    /// 
    /// </summary>

    let VersionGroupList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<VersionGroupListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : VersionGroupListArgs
          let result = VersionGroupApiService.VersionGroupList ctx serviceArgs
          return! (match result with
                      | VersionGroupListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region VersionGroupRead
    /// <summary>
    /// 
    /// </summary>

    let VersionGroupRead (pathParams:VersionGroupReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : VersionGroupReadArgs
          let result = VersionGroupApiService.VersionGroupRead ctx serviceArgs
          return! (match result with
                      | VersionGroupReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

