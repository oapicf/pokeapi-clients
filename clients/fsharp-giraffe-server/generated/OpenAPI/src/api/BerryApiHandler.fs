namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open BerryApiHandlerParams
open BerryApiServiceInterface
open BerryApiServiceImplementation

module BerryApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region BerryList
    /// <summary>
    /// 
    /// </summary>

    let BerryList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BerryListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : BerryListArgs
          let result = BerryApiService.BerryList ctx serviceArgs
          return! (match result with
                      | BerryListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region BerryRead
    /// <summary>
    /// 
    /// </summary>

    let BerryRead (pathParams:BerryReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : BerryReadArgs
          let result = BerryApiService.BerryRead ctx serviceArgs
          return! (match result with
                      | BerryReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

