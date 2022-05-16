namespace OpenAPI

open VersionGroupApiHandlerParams
open VersionGroupApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module VersionGroupApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region VersionGroupList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("VersionGroupList")>]
    let VersionGroupList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/version-group/")>]
        req:HttpRequest ) =

      let result = VersionGroupApiService.VersionGroupList ()
      match result with
      | VersionGroupListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region VersionGroupRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("VersionGroupRead")>]
    let VersionGroupRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/version-group/{id}/")>]
        req:HttpRequest ) =

      let result = VersionGroupApiService.VersionGroupRead ()
      match result with
      | VersionGroupReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

