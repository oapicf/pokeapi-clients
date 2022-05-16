namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open RegionApiHandlerParams
open RegionApiServiceInterface
open RegionApiServiceImplementation

module RegionApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region RegionList
    /// <summary>
    /// 
    /// </summary>

    let RegionList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<RegionListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : RegionListArgs
          let result = RegionApiService.RegionList ctx serviceArgs
          return! (match result with
                      | RegionListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region RegionRead
    /// <summary>
    /// 
    /// </summary>

    let RegionRead (pathParams:RegionReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RegionReadArgs
          let result = RegionApiService.RegionRead ctx serviceArgs
          return! (match result with
                      | RegionReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

