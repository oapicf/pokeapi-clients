namespace OpenAPI

open RegionApiHandlerParams
open RegionApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module RegionApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region RegionList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("RegionList")>]
    let RegionList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/region/")>]
        req:HttpRequest ) =

      let result = RegionApiService.RegionList ()
      match result with
      | RegionListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region RegionRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("RegionRead")>]
    let RegionRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/region/{id}/")>]
        req:HttpRequest ) =

      let result = RegionApiService.RegionRead ()
      match result with
      | RegionReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

