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

    //#region AbilityList
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("AbilityList")>]
    let AbilityList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/ability/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.AbilityList ()
      match result with
      | AbilityListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region AbilityRetrieve
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("AbilityRetrieve")>]
    let AbilityRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/ability/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.AbilityRetrieve ()
      match result with
      | AbilityRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CharacteristicList
    /// <summary>
    /// List charecterictics
    /// </summary>
   [<FunctionName("CharacteristicList")>]
    let CharacteristicList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/characteristic/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.CharacteristicList ()
      match result with
      | CharacteristicListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CharacteristicRetrieve
    /// <summary>
    /// Get characteristic
    /// </summary>
   [<FunctionName("CharacteristicRetrieve")>]
    let CharacteristicRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/characteristic/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.CharacteristicRetrieve ()
      match result with
      | CharacteristicRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region EggGroupList
    /// <summary>
    /// List egg groups
    /// </summary>
   [<FunctionName("EggGroupList")>]
    let EggGroupList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/egg-group/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.EggGroupList ()
      match result with
      | EggGroupListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region EggGroupRetrieve
    /// <summary>
    /// Get egg group
    /// </summary>
   [<FunctionName("EggGroupRetrieve")>]
    let EggGroupRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/egg-group/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.EggGroupRetrieve ()
      match result with
      | EggGroupRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GenderList
    /// <summary>
    /// List genders
    /// </summary>
   [<FunctionName("GenderList")>]
    let GenderList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/gender/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.GenderList ()
      match result with
      | GenderListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GenderRetrieve
    /// <summary>
    /// Get gender
    /// </summary>
   [<FunctionName("GenderRetrieve")>]
    let GenderRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/gender/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.GenderRetrieve ()
      match result with
      | GenderRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GrowthRateList
    /// <summary>
    /// List growth rates
    /// </summary>
   [<FunctionName("GrowthRateList")>]
    let GrowthRateList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/growth-rate/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.GrowthRateList ()
      match result with
      | GrowthRateListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GrowthRateRetrieve
    /// <summary>
    /// Get growth rate
    /// </summary>
   [<FunctionName("GrowthRateRetrieve")>]
    let GrowthRateRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/growth-rate/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.GrowthRateRetrieve ()
      match result with
      | GrowthRateRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region MoveDamageClassList
    /// <summary>
    /// List move damage classes
    /// </summary>
   [<FunctionName("MoveDamageClassList")>]
    let MoveDamageClassList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-damage-class/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.MoveDamageClassList ()
      match result with
      | MoveDamageClassListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region MoveDamageClassRetrieve
    /// <summary>
    /// Get move damage class
    /// </summary>
   [<FunctionName("MoveDamageClassRetrieve")>]
    let MoveDamageClassRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/move-damage-class/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.MoveDamageClassRetrieve ()
      match result with
      | MoveDamageClassRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region NatureList
    /// <summary>
    /// List natures
    /// </summary>
   [<FunctionName("NatureList")>]
    let NatureList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/nature/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.NatureList ()
      match result with
      | NatureListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region NatureRetrieve
    /// <summary>
    /// Get nature
    /// </summary>
   [<FunctionName("NatureRetrieve")>]
    let NatureRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/nature/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.NatureRetrieve ()
      match result with
      | NatureRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokeathlonStatList
    /// <summary>
    /// List pokeathlon stats
    /// </summary>
   [<FunctionName("PokeathlonStatList")>]
    let PokeathlonStatList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokeathlon-stat/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.PokeathlonStatList ()
      match result with
      | PokeathlonStatListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokeathlonStatRetrieve
    /// <summary>
    /// Get pokeathlon stat
    /// </summary>
   [<FunctionName("PokeathlonStatRetrieve")>]
    let PokeathlonStatRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokeathlon-stat/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.PokeathlonStatRetrieve ()
      match result with
      | PokeathlonStatRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokemonColorList
    /// <summary>
    /// List pokemon colors
    /// </summary>
   [<FunctionName("PokemonColorList")>]
    let PokemonColorList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-color/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.PokemonColorList ()
      match result with
      | PokemonColorListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokemonColorRetrieve
    /// <summary>
    /// Get pokemon color
    /// </summary>
   [<FunctionName("PokemonColorRetrieve")>]
    let PokemonColorRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-color/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.PokemonColorRetrieve ()
      match result with
      | PokemonColorRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokemonFormList
    /// <summary>
    /// List pokemon forms
    /// </summary>
   [<FunctionName("PokemonFormList")>]
    let PokemonFormList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-form/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.PokemonFormList ()
      match result with
      | PokemonFormListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokemonFormRetrieve
    /// <summary>
    /// Get pokemon form
    /// </summary>
   [<FunctionName("PokemonFormRetrieve")>]
    let PokemonFormRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-form/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.PokemonFormRetrieve ()
      match result with
      | PokemonFormRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokemonHabitatList
    /// <summary>
    /// List pokemom habitas
    /// </summary>
   [<FunctionName("PokemonHabitatList")>]
    let PokemonHabitatList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-habitat/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.PokemonHabitatList ()
      match result with
      | PokemonHabitatListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokemonHabitatRetrieve
    /// <summary>
    /// Get pokemom habita
    /// </summary>
   [<FunctionName("PokemonHabitatRetrieve")>]
    let PokemonHabitatRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-habitat/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.PokemonHabitatRetrieve ()
      match result with
      | PokemonHabitatRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokemonList
    /// <summary>
    /// List pokemon
    /// </summary>
   [<FunctionName("PokemonList")>]
    let PokemonList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.PokemonList ()
      match result with
      | PokemonListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokemonRetrieve
    /// <summary>
    /// Get pokemon
    /// </summary>
   [<FunctionName("PokemonRetrieve")>]
    let PokemonRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.PokemonRetrieve ()
      match result with
      | PokemonRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokemonShapeList
    /// <summary>
    /// List pokemon shapes
    /// </summary>
   [<FunctionName("PokemonShapeList")>]
    let PokemonShapeList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-shape/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.PokemonShapeList ()
      match result with
      | PokemonShapeListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokemonShapeRetrieve
    /// <summary>
    /// Get pokemon shape
    /// </summary>
   [<FunctionName("PokemonShapeRetrieve")>]
    let PokemonShapeRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-shape/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.PokemonShapeRetrieve ()
      match result with
      | PokemonShapeRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokemonSpeciesList
    /// <summary>
    /// List pokemon species
    /// </summary>
   [<FunctionName("PokemonSpeciesList")>]
    let PokemonSpeciesList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-species/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.PokemonSpeciesList ()
      match result with
      | PokemonSpeciesListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region PokemonSpeciesRetrieve
    /// <summary>
    /// Get pokemon species
    /// </summary>
   [<FunctionName("PokemonSpeciesRetrieve")>]
    let PokemonSpeciesRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/pokemon-species/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.PokemonSpeciesRetrieve ()
      match result with
      | PokemonSpeciesRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region StatList
    /// <summary>
    /// List stats
    /// </summary>
   [<FunctionName("StatList")>]
    let StatList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/stat/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.StatList ()
      match result with
      | StatListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region StatRetrieve
    /// <summary>
    /// Get stat
    /// </summary>
   [<FunctionName("StatRetrieve")>]
    let StatRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/stat/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.StatRetrieve ()
      match result with
      | StatRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region TypeList
    /// <summary>
    /// List types
    /// </summary>
   [<FunctionName("TypeList")>]
    let TypeList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/type/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.TypeList ()
      match result with
      | TypeListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region TypeRetrieve
    /// <summary>
    /// Get types
    /// </summary>
   [<FunctionName("TypeRetrieve")>]
    let TypeRetrieve
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v2/type/{id}/")>]
        req:HttpRequest ) =

      let result = PokemonApiService.TypeRetrieve ()
      match result with
      | TypeRetrieveStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

