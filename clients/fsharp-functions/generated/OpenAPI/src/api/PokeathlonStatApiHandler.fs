namespace OpenAPI

open PokeathlonStatApiHandlerParams
open PokeathlonStatApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module PokeathlonStatApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region PokeathlonStatList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PokeathlonStatList")>]
    let PokeathlonStatList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/pokeathlon-stat/")>]
        req:HttpRequest ) =

      let result = PokeathlonStatApiService.PokeathlonStatList ()
      match result with
      | PokeathlonStatListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PokeathlonStatRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PokeathlonStatRead")>]
    let PokeathlonStatRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/pokeathlon-stat/{id}/")>]
        req:HttpRequest ) =

      let result = PokeathlonStatApiService.PokeathlonStatRead ()
      match result with
      | PokeathlonStatReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

