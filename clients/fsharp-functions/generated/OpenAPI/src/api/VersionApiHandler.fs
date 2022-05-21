namespace OpenAPI

open VersionApiHandlerParams
open VersionApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module VersionApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region VersionList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("VersionList")>]
    let VersionList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/version/")>]
        req:HttpRequest ) =

      let result = VersionApiService.VersionList ()
      match result with
      | VersionListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region VersionRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("VersionRead")>]
    let VersionRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/version/{id}/")>]
        req:HttpRequest ) =

      let result = VersionApiService.VersionRead ()
      match result with
      | VersionReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

