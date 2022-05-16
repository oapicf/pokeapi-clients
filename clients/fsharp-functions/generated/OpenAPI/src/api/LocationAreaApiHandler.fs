namespace OpenAPI

open LocationAreaApiHandlerParams
open LocationAreaApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module LocationAreaApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region LocationAreaList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("LocationAreaList")>]
    let LocationAreaList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/location-area/")>]
        req:HttpRequest ) =

      let result = LocationAreaApiService.LocationAreaList ()
      match result with
      | LocationAreaListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region LocationAreaRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("LocationAreaRead")>]
    let LocationAreaRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/location-area/{id}/")>]
        req:HttpRequest ) =

      let result = LocationAreaApiService.LocationAreaRead ()
      match result with
      | LocationAreaReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

