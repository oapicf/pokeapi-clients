namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open BerryFirmnessApiHandlerParams
open BerryFirmnessApiServiceInterface
open BerryFirmnessApiServiceImplementation

module BerryFirmnessApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region BerryFirmnessList
    /// <summary>
    /// 
    /// </summary>

    let BerryFirmnessList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BerryFirmnessListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : BerryFirmnessListArgs
          let result = BerryFirmnessApiService.BerryFirmnessList ctx serviceArgs
          return! (match result with
                      | BerryFirmnessListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region BerryFirmnessRead
    /// <summary>
    /// 
    /// </summary>

    let BerryFirmnessRead (pathParams:BerryFirmnessReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : BerryFirmnessReadArgs
          let result = BerryFirmnessApiService.BerryFirmnessRead ctx serviceArgs
          return! (match result with
                      | BerryFirmnessReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

