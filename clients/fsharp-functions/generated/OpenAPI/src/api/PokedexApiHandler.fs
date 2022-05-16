namespace OpenAPI

open PokedexApiHandlerParams
open PokedexApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module PokedexApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region PokedexList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PokedexList")>]
    let PokedexList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/pokedex/")>]
        req:HttpRequest ) =

      let result = PokedexApiService.PokedexList ()
      match result with
      | PokedexListDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PokedexRead
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("PokedexRead")>]
    let PokedexRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/api/v2/pokedex/{id}/")>]
        req:HttpRequest ) =

      let result = PokedexApiService.PokedexRead ()
      match result with
      | PokedexReadDefaultStatusCode resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

