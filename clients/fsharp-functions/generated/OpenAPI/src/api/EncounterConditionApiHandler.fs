namespace OpenAPI

open EncounterConditionApiHandlerParams
open EncounterConditionApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module EncounterConditionApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region EncounterConditionList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("EncounterConditionList")>]
    let EncounterConditionList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/encounter-condition/")>]
        req:HttpRequest ) =

      let result = EncounterConditionApiService.EncounterConditionList ()
      match result with
      | EncounterConditionListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region EncounterConditionRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("EncounterConditionRead")>]
    let EncounterConditionRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/encounter-condition/{id}/")>]
        req:HttpRequest ) =

      let result = EncounterConditionApiService.EncounterConditionRead ()
      match result with
      | EncounterConditionReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

