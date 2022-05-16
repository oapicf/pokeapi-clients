namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open PalParkAreaApiHandlerParams
open PalParkAreaApiServiceInterface
open PalParkAreaApiServiceImplementation

module PalParkAreaApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region PalParkAreaList
    /// <summary>
    /// 
    /// </summary>

    let PalParkAreaList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PalParkAreaListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PalParkAreaListArgs
          let result = PalParkAreaApiService.PalParkAreaList ctx serviceArgs
          return! (match result with
                      | PalParkAreaListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region PalParkAreaRead
    /// <summary>
    /// 
    /// </summary>

    let PalParkAreaRead (pathParams:PalParkAreaReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PalParkAreaReadArgs
          let result = PalParkAreaApiService.PalParkAreaRead ctx serviceArgs
          return! (match result with
                      | PalParkAreaReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

