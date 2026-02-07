namespace OpenAPI

open EvolutionApiHandlerParams
open EvolutionApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module EvolutionApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region EvolutionChainList
    /// <summary>
    /// List evolution chains
    /// </summary>
   [<FunctionName("EvolutionChainList")>]
    let EvolutionChainList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/evolution-chain/")>]
        req:HttpRequest ) =

      let result = EvolutionApiService.EvolutionChainList ()
      match result with
      | EvolutionChainListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region EvolutionChainRetrieve
    /// <summary>
    /// Get evolution chain
    /// </summary>
   [<FunctionName("EvolutionChainRetrieve")>]
    let EvolutionChainRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/evolution-chain/{id}/")>]
        req:HttpRequest ) =

      let result = EvolutionApiService.EvolutionChainRetrieve ()
      match result with
      | EvolutionChainRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region EvolutionTriggerList
    /// <summary>
    /// List evolution triggers
    /// </summary>
   [<FunctionName("EvolutionTriggerList")>]
    let EvolutionTriggerList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/evolution-trigger/")>]
        req:HttpRequest ) =

      let result = EvolutionApiService.EvolutionTriggerList ()
      match result with
      | EvolutionTriggerListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region EvolutionTriggerRetrieve
    /// <summary>
    /// Get evolution trigger
    /// </summary>
   [<FunctionName("EvolutionTriggerRetrieve")>]
    let EvolutionTriggerRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/evolution-trigger/{id}/")>]
        req:HttpRequest ) =

      let result = EvolutionApiService.EvolutionTriggerRetrieve ()
      match result with
      | EvolutionTriggerRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

