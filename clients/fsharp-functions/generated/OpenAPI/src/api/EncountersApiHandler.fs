namespace OpenAPI

open EncountersApiHandlerParams
open EncountersApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module EncountersApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region EncounterConditionList
    /// <summary>
    /// List encounter conditions
    /// </summary>
   [<FunctionName("EncounterConditionList")>]
    let EncounterConditionList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/encounter-condition/")>]
        req:HttpRequest ) =

      let result = EncountersApiService.EncounterConditionList ()
      match result with
      | EncounterConditionListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region EncounterConditionRetrieve
    /// <summary>
    /// Get encounter condition
    /// </summary>
   [<FunctionName("EncounterConditionRetrieve")>]
    let EncounterConditionRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/encounter-condition/{id}/")>]
        req:HttpRequest ) =

      let result = EncountersApiService.EncounterConditionRetrieve ()
      match result with
      | EncounterConditionRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region EncounterConditionValueList
    /// <summary>
    /// List encounter condition values
    /// </summary>
   [<FunctionName("EncounterConditionValueList")>]
    let EncounterConditionValueList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/encounter-condition-value/")>]
        req:HttpRequest ) =

      let result = EncountersApiService.EncounterConditionValueList ()
      match result with
      | EncounterConditionValueListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region EncounterConditionValueRetrieve
    /// <summary>
    /// Get encounter condition value
    /// </summary>
   [<FunctionName("EncounterConditionValueRetrieve")>]
    let EncounterConditionValueRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/encounter-condition-value/{id}/")>]
        req:HttpRequest ) =

      let result = EncountersApiService.EncounterConditionValueRetrieve ()
      match result with
      | EncounterConditionValueRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region EncounterMethodList
    /// <summary>
    /// List encounter methods
    /// </summary>
   [<FunctionName("EncounterMethodList")>]
    let EncounterMethodList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/encounter-method/")>]
        req:HttpRequest ) =

      let result = EncountersApiService.EncounterMethodList ()
      match result with
      | EncounterMethodListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region EncounterMethodRetrieve
    /// <summary>
    /// Get encounter method
    /// </summary>
   [<FunctionName("EncounterMethodRetrieve")>]
    let EncounterMethodRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/encounter-method/{id}/")>]
        req:HttpRequest ) =

      let result = EncountersApiService.EncounterMethodRetrieve ()
      match result with
      | EncounterMethodRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokemonEncountersRetrieve
    /// <summary>
    /// Get pokemon encounter
    /// </summary>
   [<FunctionName("PokemonEncountersRetrieve")>]
    let PokemonEncountersRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon/{pokemon_id}/encounters")>]
        req:HttpRequest ) =

      let result = EncountersApiService.PokemonEncountersRetrieve ()
      match result with
      | PokemonEncountersRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

