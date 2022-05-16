namespace OpenAPI

open LanguageApiHandlerParams
open LanguageApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module LanguageApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region LanguageList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("LanguageList")>]
    let LanguageList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/language/")>]
        req:HttpRequest ) =

      let result = LanguageApiService.LanguageList ()
      match result with
      | LanguageListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region LanguageRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("LanguageRead")>]
    let LanguageRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/language/{id}/")>]
        req:HttpRequest ) =

      let result = LanguageApiService.LanguageRead ()
      match result with
      | LanguageReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

