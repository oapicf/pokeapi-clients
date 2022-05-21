namespace OpenAPI

open BerryFlavorApiHandlerParams
open BerryFlavorApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module BerryFlavorApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region BerryFlavorList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("BerryFlavorList")>]
    let BerryFlavorList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/berry-flavor/")>]
        req:HttpRequest ) =

      let result = BerryFlavorApiService.BerryFlavorList ()
      match result with
      | BerryFlavorListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region BerryFlavorRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("BerryFlavorRead")>]
    let BerryFlavorRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/berry-flavor/{id}/")>]
        req:HttpRequest ) =

      let result = BerryFlavorApiService.BerryFlavorRead ()
      match result with
      | BerryFlavorReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

