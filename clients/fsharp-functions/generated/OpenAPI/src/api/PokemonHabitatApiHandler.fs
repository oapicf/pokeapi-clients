namespace OpenAPI

open PokemonHabitatApiHandlerParams
open PokemonHabitatApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module PokemonHabitatApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region PokemonHabitatList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PokemonHabitatList")>]
    let PokemonHabitatList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-habitat/")>]
        req:HttpRequest ) =

      let result = PokemonHabitatApiService.PokemonHabitatList ()
      match result with
      | PokemonHabitatListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PokemonHabitatRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PokemonHabitatRead")>]
    let PokemonHabitatRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-habitat/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonHabitatApiService.PokemonHabitatRead ()
      match result with
      | PokemonHabitatReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

