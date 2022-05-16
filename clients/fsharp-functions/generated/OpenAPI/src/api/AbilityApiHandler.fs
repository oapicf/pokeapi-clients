namespace OpenAPI

open AbilityApiHandlerParams
open AbilityApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module AbilityApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region AbilityList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("AbilityList")>]
    let AbilityList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/ability/")>]
        req:HttpRequest ) =

      let result = AbilityApiService.AbilityList ()
      match result with
      | AbilityListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AbilityRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("AbilityRead")>]
    let AbilityRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/ability/{id}/")>]
        req:HttpRequest ) =

      let result = AbilityApiService.AbilityRead ()
      match result with
      | AbilityReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

