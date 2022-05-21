namespace OpenAPI

open NatureApiHandlerParams
open NatureApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module NatureApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region NatureList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("NatureList")>]
    let NatureList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/nature/")>]
        req:HttpRequest ) =

      let result = NatureApiService.NatureList ()
      match result with
      | NatureListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region NatureRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("NatureRead")>]
    let NatureRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/nature/{id}/")>]
        req:HttpRequest ) =

      let result = NatureApiService.NatureRead ()
      match result with
      | NatureReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

