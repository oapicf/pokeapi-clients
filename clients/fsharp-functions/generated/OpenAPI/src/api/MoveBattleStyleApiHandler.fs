namespace OpenAPI

open MoveBattleStyleApiHandlerParams
open MoveBattleStyleApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module MoveBattleStyleApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region MoveBattleStyleList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("MoveBattleStyleList")>]
    let MoveBattleStyleList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-battle-style/")>]
        req:HttpRequest ) =

      let result = MoveBattleStyleApiService.MoveBattleStyleList ()
      match result with
      | MoveBattleStyleListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region MoveBattleStyleRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("MoveBattleStyleRead")>]
    let MoveBattleStyleRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-battle-style/{id}/")>]
        req:HttpRequest ) =

      let result = MoveBattleStyleApiService.MoveBattleStyleRead ()
      match result with
      | MoveBattleStyleReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

