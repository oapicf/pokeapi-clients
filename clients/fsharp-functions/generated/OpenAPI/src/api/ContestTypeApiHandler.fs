namespace OpenAPI

open ContestTypeApiHandlerParams
open ContestTypeApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ContestTypeApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region ContestTypeList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("ContestTypeList")>]
    let ContestTypeList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/contest-type/")>]
        req:HttpRequest ) =

      let result = ContestTypeApiService.ContestTypeList ()
      match result with
      | ContestTypeListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region ContestTypeRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("ContestTypeRead")>]
    let ContestTypeRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/contest-type/{id}/")>]
        req:HttpRequest ) =

      let result = ContestTypeApiService.ContestTypeRead ()
      match result with
      | ContestTypeReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

