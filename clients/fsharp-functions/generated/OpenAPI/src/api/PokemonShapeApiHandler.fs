namespace OpenAPI

open PokemonShapeApiHandlerParams
open PokemonShapeApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module PokemonShapeApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region PokemonShapeList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PokemonShapeList")>]
    let PokemonShapeList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-shape/")>]
        req:HttpRequest ) =

      let result = PokemonShapeApiService.PokemonShapeList ()
      match result with
      | PokemonShapeListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PokemonShapeRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PokemonShapeRead")>]
    let PokemonShapeRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-shape/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonShapeApiService.PokemonShapeRead ()
      match result with
      | PokemonShapeReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

