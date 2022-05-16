namespace OpenAPI

open MoveLearnMethodApiHandlerParams
open MoveLearnMethodApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module MoveLearnMethodApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region MoveLearnMethodList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("MoveLearnMethodList")>]
    let MoveLearnMethodList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/move-learn-method/")>]
        req:HttpRequest ) =

      let result = MoveLearnMethodApiService.MoveLearnMethodList ()
      match result with
      | MoveLearnMethodListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region MoveLearnMethodRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("MoveLearnMethodRead")>]
    let MoveLearnMethodRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/move-learn-method/{id}/")>]
        req:HttpRequest ) =

      let result = MoveLearnMethodApiService.MoveLearnMethodRead ()
      match result with
      | MoveLearnMethodReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

