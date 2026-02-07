namespace OpenAPI

open GamesApiHandlerParams
open GamesApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module GamesApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region GenerationList
    /// <summary>
    /// List genrations
    /// </summary>
   [<FunctionName("GenerationList")>]
    let GenerationList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/generation/")>]
        req:HttpRequest ) =

      let result = GamesApiService.GenerationList ()
      match result with
      | GenerationListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GenerationRetrieve
    /// <summary>
    /// Get genration
    /// </summary>
   [<FunctionName("GenerationRetrieve")>]
    let GenerationRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/generation/{id}/")>]
        req:HttpRequest ) =

      let result = GamesApiService.GenerationRetrieve ()
      match result with
      | GenerationRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokedexList
    /// <summary>
    /// List pokedex
    /// </summary>
   [<FunctionName("PokedexList")>]
    let PokedexList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokedex/")>]
        req:HttpRequest ) =

      let result = GamesApiService.PokedexList ()
      match result with
      | PokedexListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokedexRetrieve
    /// <summary>
    /// Get pokedex
    /// </summary>
   [<FunctionName("PokedexRetrieve")>]
    let PokedexRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokedex/{id}/")>]
        req:HttpRequest ) =

      let result = GamesApiService.PokedexRetrieve ()
      match result with
      | PokedexRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region VersionGroupList
    /// <summary>
    /// List version groups
    /// </summary>
   [<FunctionName("VersionGroupList")>]
    let VersionGroupList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/version-group/")>]
        req:HttpRequest ) =

      let result = GamesApiService.VersionGroupList ()
      match result with
      | VersionGroupListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region VersionGroupRetrieve
    /// <summary>
    /// Get version group
    /// </summary>
   [<FunctionName("VersionGroupRetrieve")>]
    let VersionGroupRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/version-group/{id}/")>]
        req:HttpRequest ) =

      let result = GamesApiService.VersionGroupRetrieve ()
      match result with
      | VersionGroupRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region VersionList
    /// <summary>
    /// List versions
    /// </summary>
   [<FunctionName("VersionList")>]
    let VersionList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/version/")>]
        req:HttpRequest ) =

      let result = GamesApiService.VersionList ()
      match result with
      | VersionListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region VersionRetrieve
    /// <summary>
    /// Get version
    /// </summary>
   [<FunctionName("VersionRetrieve")>]
    let VersionRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/version/{id}/")>]
        req:HttpRequest ) =

      let result = GamesApiService.VersionRetrieve ()
      match result with
      | VersionRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

