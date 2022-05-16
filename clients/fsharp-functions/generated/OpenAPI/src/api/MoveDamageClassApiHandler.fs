namespace OpenAPI

open MoveDamageClassApiHandlerParams
open MoveDamageClassApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module MoveDamageClassApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region MoveDamageClassList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("MoveDamageClassList")>]
    let MoveDamageClassList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/move-damage-class/")>]
        req:HttpRequest ) =

      let result = MoveDamageClassApiService.MoveDamageClassList ()
      match result with
      | MoveDamageClassListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region MoveDamageClassRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("MoveDamageClassRead")>]
    let MoveDamageClassRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/move-damage-class/{id}/")>]
        req:HttpRequest ) =

      let result = MoveDamageClassApiService.MoveDamageClassRead ()
      match result with
      | MoveDamageClassReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

