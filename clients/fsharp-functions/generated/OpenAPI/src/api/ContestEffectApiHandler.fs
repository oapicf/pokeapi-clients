namespace OpenAPI

open ContestEffectApiHandlerParams
open ContestEffectApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ContestEffectApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region ContestEffectList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("ContestEffectList")>]
    let ContestEffectList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/contest-effect/")>]
        req:HttpRequest ) =

      let result = ContestEffectApiService.ContestEffectList ()
      match result with
      | ContestEffectListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region ContestEffectRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("ContestEffectRead")>]
    let ContestEffectRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/contest-effect/{id}/")>]
        req:HttpRequest ) =

      let result = ContestEffectApiService.ContestEffectRead ()
      match result with
      | ContestEffectReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

