namespace OpenAPI

open EggGroupApiHandlerParams
open EggGroupApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module EggGroupApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region EggGroupList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("EggGroupList")>]
    let EggGroupList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/egg-group/")>]
        req:HttpRequest ) =

      let result = EggGroupApiService.EggGroupList ()
      match result with
      | EggGroupListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region EggGroupRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("EggGroupRead")>]
    let EggGroupRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/egg-group/{id}/")>]
        req:HttpRequest ) =

      let result = EggGroupApiService.EggGroupRead ()
      match result with
      | EggGroupReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

