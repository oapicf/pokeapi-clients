namespace OpenAPI

open EvolutionChainApiHandlerParams
open EvolutionChainApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module EvolutionChainApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region EvolutionChainList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("EvolutionChainList")>]
    let EvolutionChainList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/evolution-chain/")>]
        req:HttpRequest ) =

      let result = EvolutionChainApiService.EvolutionChainList ()
      match result with
      | EvolutionChainListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region EvolutionChainRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("EvolutionChainRead")>]
    let EvolutionChainRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/evolution-chain/{id}/")>]
        req:HttpRequest ) =

      let result = EvolutionChainApiService.EvolutionChainRead ()
      match result with
      | EvolutionChainReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

