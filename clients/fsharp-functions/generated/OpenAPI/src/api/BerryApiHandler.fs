namespace OpenAPI

open BerryApiHandlerParams
open BerryApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module BerryApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region BerryList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("BerryList")>]
    let BerryList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/berry/")>]
        req:HttpRequest ) =

      let result = BerryApiService.BerryList ()
      match result with
      | BerryListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region BerryRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("BerryRead")>]
    let BerryRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/berry/{id}/")>]
        req:HttpRequest ) =

      let result = BerryApiService.BerryRead ()
      match result with
      | BerryReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

