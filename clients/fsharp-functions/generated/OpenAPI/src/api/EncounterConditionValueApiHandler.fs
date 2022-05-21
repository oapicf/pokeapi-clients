namespace OpenAPI

open EncounterConditionValueApiHandlerParams
open EncounterConditionValueApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module EncounterConditionValueApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region EncounterConditionValueList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("EncounterConditionValueList")>]
    let EncounterConditionValueList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/encounter-condition-value/")>]
        req:HttpRequest ) =

      let result = EncounterConditionValueApiService.EncounterConditionValueList ()
      match result with
      | EncounterConditionValueListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region EncounterConditionValueRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("EncounterConditionValueRead")>]
    let EncounterConditionValueRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/encounter-condition-value/{id}/")>]
        req:HttpRequest ) =

      let result = EncounterConditionValueApiService.EncounterConditionValueRead ()
      match result with
      | EncounterConditionValueReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

