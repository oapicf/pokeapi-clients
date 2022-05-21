namespace OpenAPI

open SuperContestEffectApiHandlerParams
open SuperContestEffectApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module SuperContestEffectApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region SuperContestEffectList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("SuperContestEffectList")>]
    let SuperContestEffectList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/super-contest-effect/")>]
        req:HttpRequest ) =

      let result = SuperContestEffectApiService.SuperContestEffectList ()
      match result with
      | SuperContestEffectListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region SuperContestEffectRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("SuperContestEffectRead")>]
    let SuperContestEffectRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/super-contest-effect/{id}/")>]
        req:HttpRequest ) =

      let result = SuperContestEffectApiService.SuperContestEffectRead ()
      match result with
      | SuperContestEffectReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

