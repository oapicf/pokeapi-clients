namespace OpenAPI

open BerriesApiHandlerParams
open BerriesApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module BerriesApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region BerryFirmnessList
    /// <summary>
    /// List berry firmness
    /// </summary>
   [<FunctionName("BerryFirmnessList")>]
    let BerryFirmnessList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/berry-firmness/")>]
        req:HttpRequest ) =

      let result = BerriesApiService.BerryFirmnessList ()
      match result with
      | BerryFirmnessListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region BerryFirmnessRetrieve
    /// <summary>
    /// Get berry by firmness
    /// </summary>
   [<FunctionName("BerryFirmnessRetrieve")>]
    let BerryFirmnessRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/berry-firmness/{id}/")>]
        req:HttpRequest ) =

      let result = BerriesApiService.BerryFirmnessRetrieve ()
      match result with
      | BerryFirmnessRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region BerryFlavorList
    /// <summary>
    /// List berry flavors
    /// </summary>
   [<FunctionName("BerryFlavorList")>]
    let BerryFlavorList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/berry-flavor/")>]
        req:HttpRequest ) =

      let result = BerriesApiService.BerryFlavorList ()
      match result with
      | BerryFlavorListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region BerryFlavorRetrieve
    /// <summary>
    /// Get berries by flavor
    /// </summary>
   [<FunctionName("BerryFlavorRetrieve")>]
    let BerryFlavorRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/berry-flavor/{id}/")>]
        req:HttpRequest ) =

      let result = BerriesApiService.BerryFlavorRetrieve ()
      match result with
      | BerryFlavorRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region BerryList
    /// <summary>
    /// List berries
    /// </summary>
   [<FunctionName("BerryList")>]
    let BerryList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/berry/")>]
        req:HttpRequest ) =

      let result = BerriesApiService.BerryList ()
      match result with
      | BerryListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region BerryRetrieve
    /// <summary>
    /// Get a berry
    /// </summary>
   [<FunctionName("BerryRetrieve")>]
    let BerryRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/berry/{id}/")>]
        req:HttpRequest ) =

      let result = BerriesApiService.BerryRetrieve ()
      match result with
      | BerryRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

