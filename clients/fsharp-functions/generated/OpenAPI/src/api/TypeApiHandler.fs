namespace OpenAPI

open TypeApiHandlerParams
open TypeApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module TypeApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region TypeList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("TypeList")>]
    let TypeList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/type/")>]
        req:HttpRequest ) =

      let result = TypeApiService.TypeList ()
      match result with
      | TypeListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region TypeRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("TypeRead")>]
    let TypeRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/type/{id}/")>]
        req:HttpRequest ) =

      let result = TypeApiService.TypeRead ()
      match result with
      | TypeReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

