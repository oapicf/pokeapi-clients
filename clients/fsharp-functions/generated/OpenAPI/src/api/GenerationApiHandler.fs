namespace OpenAPI

open GenerationApiHandlerParams
open GenerationApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module GenerationApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region GenerationList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GenerationList")>]
    let GenerationList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/generation/")>]
        req:HttpRequest ) =

      let result = GenerationApiService.GenerationList ()
      match result with
      | GenerationListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GenerationRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GenerationRead")>]
    let GenerationRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/generation/{id}/")>]
        req:HttpRequest ) =

      let result = GenerationApiService.GenerationRead ()
      match result with
      | GenerationReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

