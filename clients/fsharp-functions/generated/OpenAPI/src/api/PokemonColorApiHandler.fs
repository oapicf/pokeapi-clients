namespace OpenAPI

open PokemonColorApiHandlerParams
open PokemonColorApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module PokemonColorApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region PokemonColorList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PokemonColorList")>]
    let PokemonColorList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-color/")>]
        req:HttpRequest ) =

      let result = PokemonColorApiService.PokemonColorList ()
      match result with
      | PokemonColorListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PokemonColorRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PokemonColorRead")>]
    let PokemonColorRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-color/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonColorApiService.PokemonColorRead ()
      match result with
      | PokemonColorReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

