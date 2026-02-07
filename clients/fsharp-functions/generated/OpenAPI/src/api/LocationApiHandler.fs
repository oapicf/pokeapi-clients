namespace OpenAPI

open LocationApiHandlerParams
open LocationApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module LocationApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region LocationAreaList
    /// <summary>
    /// List location areas
    /// </summary>
   [<FunctionName("LocationAreaList")>]
    let LocationAreaList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/location-area/")>]
        req:HttpRequest ) =

      let result = LocationApiService.LocationAreaList ()
      match result with
      | LocationAreaListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region LocationAreaRetrieve
    /// <summary>
    /// Get location area
    /// </summary>
   [<FunctionName("LocationAreaRetrieve")>]
    let LocationAreaRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/location-area/{id}/")>]
        req:HttpRequest ) =

      let result = LocationApiService.LocationAreaRetrieve ()
      match result with
      | LocationAreaRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region LocationList
    /// <summary>
    /// List locations
    /// </summary>
   [<FunctionName("LocationList")>]
    let LocationList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/location/")>]
        req:HttpRequest ) =

      let result = LocationApiService.LocationList ()
      match result with
      | LocationListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region LocationRetrieve
    /// <summary>
    /// Get location
    /// </summary>
   [<FunctionName("LocationRetrieve")>]
    let LocationRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/location/{id}/")>]
        req:HttpRequest ) =

      let result = LocationApiService.LocationRetrieve ()
      match result with
      | LocationRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PalParkAreaList
    /// <summary>
    /// List pal park areas
    /// </summary>
   [<FunctionName("PalParkAreaList")>]
    let PalParkAreaList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pal-park-area/")>]
        req:HttpRequest ) =

      let result = LocationApiService.PalParkAreaList ()
      match result with
      | PalParkAreaListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PalParkAreaRetrieve
    /// <summary>
    /// Get pal park area
    /// </summary>
   [<FunctionName("PalParkAreaRetrieve")>]
    let PalParkAreaRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pal-park-area/{id}/")>]
        req:HttpRequest ) =

      let result = LocationApiService.PalParkAreaRetrieve ()
      match result with
      | PalParkAreaRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region RegionList
    /// <summary>
    /// List regions
    /// </summary>
   [<FunctionName("RegionList")>]
    let RegionList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/region/")>]
        req:HttpRequest ) =

      let result = LocationApiService.RegionList ()
      match result with
      | RegionListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region RegionRetrieve
    /// <summary>
    /// Get region
    /// </summary>
   [<FunctionName("RegionRetrieve")>]
    let RegionRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/region/{id}/")>]
        req:HttpRequest ) =

      let result = LocationApiService.RegionRetrieve ()
      match result with
      | RegionRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

