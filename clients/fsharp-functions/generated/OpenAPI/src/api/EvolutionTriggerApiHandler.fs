namespace OpenAPI

open EvolutionTriggerApiHandlerParams
open EvolutionTriggerApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module EvolutionTriggerApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region EvolutionTriggerList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("EvolutionTriggerList")>]
    let EvolutionTriggerList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/evolution-trigger/")>]
        req:HttpRequest ) =

      let result = EvolutionTriggerApiService.EvolutionTriggerList ()
      match result with
      | EvolutionTriggerListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region EvolutionTriggerRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("EvolutionTriggerRead")>]
    let EvolutionTriggerRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/evolution-trigger/{id}/")>]
        req:HttpRequest ) =

      let result = EvolutionTriggerApiService.EvolutionTriggerRead ()
      match result with
      | EvolutionTriggerReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

