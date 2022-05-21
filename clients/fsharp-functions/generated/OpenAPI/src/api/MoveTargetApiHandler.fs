namespace OpenAPI

open MoveTargetApiHandlerParams
open MoveTargetApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module MoveTargetApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region MoveTargetList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("MoveTargetList")>]
    let MoveTargetList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-target/")>]
        req:HttpRequest ) =

      let result = MoveTargetApiService.MoveTargetList ()
      match result with
      | MoveTargetListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region MoveTargetRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("MoveTargetRead")>]
    let MoveTargetRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-target/{id}/")>]
        req:HttpRequest ) =

      let result = MoveTargetApiService.MoveTargetRead ()
      match result with
      | MoveTargetReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

