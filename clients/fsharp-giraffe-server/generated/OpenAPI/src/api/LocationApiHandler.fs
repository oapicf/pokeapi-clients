namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open LocationApiHandlerParams
open LocationApiServiceInterface
open LocationApiServiceImplementation
open OpenAPI.Model.LocationAreaDetail
open OpenAPI.Model.LocationDetail
open OpenAPI.Model.PaginatedLocationAreaSummaryList
open OpenAPI.Model.PaginatedLocationSummaryList
open OpenAPI.Model.PaginatedPalParkAreaSummaryList
open OpenAPI.Model.PaginatedRegionSummaryList
open OpenAPI.Model.PalParkAreaDetail
open OpenAPI.Model.RegionDetail

module LocationApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region LocationAreaList
    /// <summary>
    /// List location areas
    /// </summary>

    let LocationAreaList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<LocationAreaListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : LocationAreaListArgs
          let result = LocationApiService.LocationAreaList ctx serviceArgs
          return! (match result with
                      | LocationAreaListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region LocationAreaRetrieve
    /// <summary>
    /// Get location area
    /// </summary>

    let LocationAreaRetrieve (pathParams:LocationAreaRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : LocationAreaRetrieveArgs
          let result = LocationApiService.LocationAreaRetrieve ctx serviceArgs
          return! (match result with
                      | LocationAreaRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region LocationList
    /// <summary>
    /// List locations
    /// </summary>

    let LocationList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<LocationListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : LocationListArgs
          let result = LocationApiService.LocationList ctx serviceArgs
          return! (match result with
                      | LocationListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region LocationRetrieve
    /// <summary>
    /// Get location
    /// </summary>

    let LocationRetrieve (pathParams:LocationRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : LocationRetrieveArgs
          let result = LocationApiService.LocationRetrieve ctx serviceArgs
          return! (match result with
                      | LocationRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PalParkAreaList
    /// <summary>
    /// List pal park areas
    /// </summary>

    let PalParkAreaList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PalParkAreaListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PalParkAreaListArgs
          let result = LocationApiService.PalParkAreaList ctx serviceArgs
          return! (match result with
                      | PalParkAreaListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PalParkAreaRetrieve
    /// <summary>
    /// Get pal park area
    /// </summary>

    let PalParkAreaRetrieve (pathParams:PalParkAreaRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PalParkAreaRetrieveArgs
          let result = LocationApiService.PalParkAreaRetrieve ctx serviceArgs
          return! (match result with
                      | PalParkAreaRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RegionList
    /// <summary>
    /// List regions
    /// </summary>

    let RegionList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<RegionListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : RegionListArgs
          let result = LocationApiService.RegionList ctx serviceArgs
          return! (match result with
                      | RegionListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RegionRetrieve
    /// <summary>
    /// Get region
    /// </summary>

    let RegionRetrieve (pathParams:RegionRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RegionRetrieveArgs
          let result = LocationApiService.RegionRetrieve ctx serviceArgs
          return! (match result with
                      | RegionRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

