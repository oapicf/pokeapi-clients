namespace OpenAPI

open MoveApiHandlerParams
open MoveApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module MoveApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region MoveList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("MoveList")>]
    let MoveList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move/")>]
        req:HttpRequest ) =

      let result = MoveApiService.MoveList ()
      match result with
      | MoveListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region MoveRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("MoveRead")>]
    let MoveRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move/{id}/")>]
        req:HttpRequest ) =

      let result = MoveApiService.MoveRead ()
      match result with
      | MoveReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

