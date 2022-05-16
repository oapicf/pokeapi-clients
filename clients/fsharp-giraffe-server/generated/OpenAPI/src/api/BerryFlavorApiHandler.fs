namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open BerryFlavorApiHandlerParams
open BerryFlavorApiServiceInterface
open BerryFlavorApiServiceImplementation

module BerryFlavorApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region BerryFlavorList
    /// <summary>
    /// 
    /// </summary>

    let BerryFlavorList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BerryFlavorListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : BerryFlavorListArgs
          let result = BerryFlavorApiService.BerryFlavorList ctx serviceArgs
          return! (match result with
                      | BerryFlavorListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region BerryFlavorRead
    /// <summary>
    /// 
    /// </summary>

    let BerryFlavorRead (pathParams:BerryFlavorReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : BerryFlavorReadArgs
          let result = BerryFlavorApiService.BerryFlavorRead ctx serviceArgs
          return! (match result with
                      | BerryFlavorReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

