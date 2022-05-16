namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open GrowthRateApiHandlerParams
open GrowthRateApiServiceInterface
open GrowthRateApiServiceImplementation

module GrowthRateApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GrowthRateList
    /// <summary>
    /// 
    /// </summary>

    let GrowthRateList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GrowthRateListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GrowthRateListArgs
          let result = GrowthRateApiService.GrowthRateList ctx serviceArgs
          return! (match result with
                      | GrowthRateListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region GrowthRateRead
    /// <summary>
    /// 
    /// </summary>

    let GrowthRateRead (pathParams:GrowthRateReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GrowthRateReadArgs
          let result = GrowthRateApiService.GrowthRateRead ctx serviceArgs
          return! (match result with
                      | GrowthRateReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> text resolved.content
          ) next ctx
        }
    //#endregion

