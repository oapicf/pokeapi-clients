namespace OpenAPI

open GenderApiHandlerParams
open GenderApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module GenderApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region GenderList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GenderList")>]
    let GenderList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/gender/")>]
        req:HttpRequest ) =

      let result = GenderApiService.GenderList ()
      match result with
      | GenderListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region GenderRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("GenderRead")>]
    let GenderRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/gender/{id}/")>]
        req:HttpRequest ) =

      let result = GenderApiService.GenderRead ()
      match result with
      | GenderReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

