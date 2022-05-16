namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open LocationApiHandlerParams
open LocationApiServiceInterface
open LocationApiServiceImplementation

module LocationApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region LocationList
    /// <summary>
    /// 
    /// </summary>

    let LocationList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<LocationListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : LocationListArgs
          let result = LocationApiService.LocationList ctx serviceArgs
          return! (match result with
                      | LocationListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region LocationRead
    /// <summary>
    /// 
    /// </summary>

    let LocationRead (pathParams:LocationReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : LocationReadArgs
          let result = LocationApiService.LocationRead ctx serviceArgs
          return! (match result with
                      | LocationReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

