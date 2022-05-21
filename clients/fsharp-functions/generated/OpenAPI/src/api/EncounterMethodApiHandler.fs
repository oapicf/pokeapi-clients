namespace OpenAPI

open EncounterMethodApiHandlerParams
open EncounterMethodApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module EncounterMethodApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region EncounterMethodList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("EncounterMethodList")>]
    let EncounterMethodList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/encounter-method/")>]
        req:HttpRequest ) =

      let result = EncounterMethodApiService.EncounterMethodList ()
      match result with
      | EncounterMethodListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region EncounterMethodRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("EncounterMethodRead")>]
    let EncounterMethodRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/encounter-method/{id}/")>]
        req:HttpRequest ) =

      let result = EncounterMethodApiService.EncounterMethodRead ()
      match result with
      | EncounterMethodReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

