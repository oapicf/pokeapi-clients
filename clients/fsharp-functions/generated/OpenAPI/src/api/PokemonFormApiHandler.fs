namespace OpenAPI

open PokemonFormApiHandlerParams
open PokemonFormApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module PokemonFormApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region PokemonFormList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PokemonFormList")>]
    let PokemonFormList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-form/")>]
        req:HttpRequest ) =

      let result = PokemonFormApiService.PokemonFormList ()
      match result with
      | PokemonFormListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PokemonFormRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PokemonFormRead")>]
    let PokemonFormRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-form/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonFormApiService.PokemonFormRead ()
      match result with
      | PokemonFormReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

