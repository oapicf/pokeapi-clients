namespace OpenAPI

open BerryFirmnessApiHandlerParams
open BerryFirmnessApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module BerryFirmnessApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region BerryFirmnessList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("BerryFirmnessList")>]
    let BerryFirmnessList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/berry-firmness/")>]
        req:HttpRequest ) =

      let result = BerryFirmnessApiService.BerryFirmnessList ()
      match result with
      | BerryFirmnessListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region BerryFirmnessRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("BerryFirmnessRead")>]
    let BerryFirmnessRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/berry-firmness/{id}/")>]
        req:HttpRequest ) =

      let result = BerryFirmnessApiService.BerryFirmnessRead ()
      match result with
      | BerryFirmnessReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

