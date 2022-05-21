namespace OpenAPI

open MoveAilmentApiHandlerParams
open MoveAilmentApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module MoveAilmentApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region MoveAilmentList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("MoveAilmentList")>]
    let MoveAilmentList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-ailment/")>]
        req:HttpRequest ) =

      let result = MoveAilmentApiService.MoveAilmentList ()
      match result with
      | MoveAilmentListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region MoveAilmentRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("MoveAilmentRead")>]
    let MoveAilmentRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-ailment/{id}/")>]
        req:HttpRequest ) =

      let result = MoveAilmentApiService.MoveAilmentRead ()
      match result with
      | MoveAilmentReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

