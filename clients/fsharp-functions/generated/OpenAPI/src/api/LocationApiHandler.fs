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

    //#region LocationList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("LocationList")>]
    let LocationList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/location/")>]
        req:HttpRequest ) =

      let result = LocationApiService.LocationList ()
      match result with
      | LocationListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region LocationRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("LocationRead")>]
    let LocationRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/location/{id}/")>]
        req:HttpRequest ) =

      let result = LocationApiService.LocationRead ()
      match result with
      | LocationReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

