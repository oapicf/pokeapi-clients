namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open LocationAreaApiHandlerParams
open LocationAreaApiServiceInterface
open LocationAreaApiServiceImplementation

module LocationAreaApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region LocationAreaList
    /// <summary>
    /// 
    /// </summary>

    let LocationAreaList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<LocationAreaListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : LocationAreaListArgs
          let result = LocationAreaApiService.LocationAreaList ctx serviceArgs
          return! (match result with
                      | LocationAreaListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region LocationAreaRead
    /// <summary>
    /// 
    /// </summary>

    let LocationAreaRead (pathParams:LocationAreaReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : LocationAreaReadArgs
          let result = LocationAreaApiService.LocationAreaRead ctx serviceArgs
          return! (match result with
                      | LocationAreaReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

