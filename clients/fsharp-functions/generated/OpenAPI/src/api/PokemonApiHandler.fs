namespace OpenAPI

open PokemonApiHandlerParams
open PokemonApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module PokemonApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region PokemonList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PokemonList")>]
    let PokemonList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/pokemon/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.PokemonList ()
      match result with
      | PokemonListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PokemonRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PokemonRead")>]
    let PokemonRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/pokemon/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.PokemonRead ()
      match result with
      | PokemonReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

