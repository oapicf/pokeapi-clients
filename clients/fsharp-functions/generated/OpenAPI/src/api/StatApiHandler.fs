namespace OpenAPI

open StatApiHandlerParams
open StatApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module StatApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region StatList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("StatList")>]
    let StatList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/stat/")>]
        req:HttpRequest ) =

      let result = StatApiService.StatList ()
      match result with
      | StatListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region StatRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("StatRead")>]
    let StatRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/stat/{id}/")>]
        req:HttpRequest ) =

      let result = StatApiService.StatRead ()
      match result with
      | StatReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

