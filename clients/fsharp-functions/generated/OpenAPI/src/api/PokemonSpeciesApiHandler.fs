namespace OpenAPI

open PokemonSpeciesApiHandlerParams
open PokemonSpeciesApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module PokemonSpeciesApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region PokemonSpeciesList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PokemonSpeciesList")>]
    let PokemonSpeciesList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/pokemon-species/")>]
        req:HttpRequest ) =

      let result = PokemonSpeciesApiService.PokemonSpeciesList ()
      match result with
      | PokemonSpeciesListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PokemonSpeciesRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PokemonSpeciesRead")>]
    let PokemonSpeciesRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/pokemon-species/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonSpeciesApiService.PokemonSpeciesRead ()
      match result with
      | PokemonSpeciesReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

