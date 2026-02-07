namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open BerriesApiHandlerParams
open BerriesApiServiceInterface
open BerriesApiServiceImplementation
open OpenAPI.Model.BerryDetail
open OpenAPI.Model.BerryFirmnessDetail
open OpenAPI.Model.BerryFlavorDetail
open OpenAPI.Model.PaginatedBerryFirmnessSummaryList
open OpenAPI.Model.PaginatedBerryFlavorSummaryList
open OpenAPI.Model.PaginatedBerrySummaryList

module BerriesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region BerryFirmnessList
    /// <summary>
    /// List berry firmness
    /// </summary>

    let BerryFirmnessList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BerryFirmnessListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : BerryFirmnessListArgs
          let result = BerriesApiService.BerryFirmnessList ctx serviceArgs
          return! (match result with
                      | BerryFirmnessListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BerryFirmnessRetrieve
    /// <summary>
    /// Get berry by firmness
    /// </summary>

    let BerryFirmnessRetrieve (pathParams:BerryFirmnessRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : BerryFirmnessRetrieveArgs
          let result = BerriesApiService.BerryFirmnessRetrieve ctx serviceArgs
          return! (match result with
                      | BerryFirmnessRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BerryFlavorList
    /// <summary>
    /// List berry flavors
    /// </summary>

    let BerryFlavorList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BerryFlavorListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : BerryFlavorListArgs
          let result = BerriesApiService.BerryFlavorList ctx serviceArgs
          return! (match result with
                      | BerryFlavorListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BerryFlavorRetrieve
    /// <summary>
    /// Get berries by flavor
    /// </summary>

    let BerryFlavorRetrieve (pathParams:BerryFlavorRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : BerryFlavorRetrieveArgs
          let result = BerriesApiService.BerryFlavorRetrieve ctx serviceArgs
          return! (match result with
                      | BerryFlavorRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BerryList
    /// <summary>
    /// List berries
    /// </summary>

    let BerryList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BerryListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : BerryListArgs
          let result = BerriesApiService.BerryList ctx serviceArgs
          return! (match result with
                      | BerryListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BerryRetrieve
    /// <summary>
    /// Get a berry
    /// </summary>

    let BerryRetrieve (pathParams:BerryRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : BerryRetrieveArgs
          let result = BerriesApiService.BerryRetrieve ctx serviceArgs
          return! (match result with
                      | BerryRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

