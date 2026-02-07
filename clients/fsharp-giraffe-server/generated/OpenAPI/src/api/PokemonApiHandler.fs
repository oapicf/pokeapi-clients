namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open PokemonApiHandlerParams
open PokemonApiServiceInterface
open PokemonApiServiceImplementation
open OpenAPI.Model.AbilityDetail
open OpenAPI.Model.CharacteristicDetail
open OpenAPI.Model.EggGroupDetail
open OpenAPI.Model.GenderDetail
open OpenAPI.Model.GrowthRateDetail
open OpenAPI.Model.MoveDamageClassDetail
open OpenAPI.Model.NatureDetail
open OpenAPI.Model.PaginatedAbilitySummaryList
open OpenAPI.Model.PaginatedCharacteristicSummaryList
open OpenAPI.Model.PaginatedEggGroupSummaryList
open OpenAPI.Model.PaginatedGenderSummaryList
open OpenAPI.Model.PaginatedGrowthRateSummaryList
open OpenAPI.Model.PaginatedMoveDamageClassSummaryList
open OpenAPI.Model.PaginatedNatureSummaryList
open OpenAPI.Model.PaginatedPokeathlonStatSummaryList
open OpenAPI.Model.PaginatedPokemonColorSummaryList
open OpenAPI.Model.PaginatedPokemonFormSummaryList
open OpenAPI.Model.PaginatedPokemonHabitatSummaryList
open OpenAPI.Model.PaginatedPokemonShapeSummaryList
open OpenAPI.Model.PaginatedPokemonSpeciesSummaryList
open OpenAPI.Model.PaginatedPokemonSummaryList
open OpenAPI.Model.PaginatedStatSummaryList
open OpenAPI.Model.PaginatedTypeSummaryList
open OpenAPI.Model.PokeathlonStatDetail
open OpenAPI.Model.PokemonColorDetail
open OpenAPI.Model.PokemonDetail
open OpenAPI.Model.PokemonFormDetail
open OpenAPI.Model.PokemonHabitatDetail
open OpenAPI.Model.PokemonShapeDetail
open OpenAPI.Model.PokemonSpeciesDetail
open OpenAPI.Model.StatDetail
open OpenAPI.Model.TypeDetail

module PokemonApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AbilityList
    /// <summary>
    /// 
    /// </summary>

    let AbilityList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AbilityListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : AbilityListArgs
          let result = PokemonApiService.AbilityList ctx serviceArgs
          return! (match result with
                      | AbilityListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AbilityRetrieve
    /// <summary>
    /// 
    /// </summary>

    let AbilityRetrieve (pathParams:AbilityRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : AbilityRetrieveArgs
          let result = PokemonApiService.AbilityRetrieve ctx serviceArgs
          return! (match result with
                      | AbilityRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CharacteristicList
    /// <summary>
    /// List charecterictics
    /// </summary>

    let CharacteristicList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CharacteristicListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : CharacteristicListArgs
          let result = PokemonApiService.CharacteristicList ctx serviceArgs
          return! (match result with
                      | CharacteristicListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CharacteristicRetrieve
    /// <summary>
    /// Get characteristic
    /// </summary>

    let CharacteristicRetrieve (pathParams:CharacteristicRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : CharacteristicRetrieveArgs
          let result = PokemonApiService.CharacteristicRetrieve ctx serviceArgs
          return! (match result with
                      | CharacteristicRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region EggGroupList
    /// <summary>
    /// List egg groups
    /// </summary>

    let EggGroupList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<EggGroupListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : EggGroupListArgs
          let result = PokemonApiService.EggGroupList ctx serviceArgs
          return! (match result with
                      | EggGroupListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region EggGroupRetrieve
    /// <summary>
    /// Get egg group
    /// </summary>

    let EggGroupRetrieve (pathParams:EggGroupRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : EggGroupRetrieveArgs
          let result = PokemonApiService.EggGroupRetrieve ctx serviceArgs
          return! (match result with
                      | EggGroupRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenderList
    /// <summary>
    /// List genders
    /// </summary>

    let GenderList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenderListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GenderListArgs
          let result = PokemonApiService.GenderList ctx serviceArgs
          return! (match result with
                      | GenderListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenderRetrieve
    /// <summary>
    /// Get gender
    /// </summary>

    let GenderRetrieve (pathParams:GenderRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GenderRetrieveArgs
          let result = PokemonApiService.GenderRetrieve ctx serviceArgs
          return! (match result with
                      | GenderRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GrowthRateList
    /// <summary>
    /// List growth rates
    /// </summary>

    let GrowthRateList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GrowthRateListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GrowthRateListArgs
          let result = PokemonApiService.GrowthRateList ctx serviceArgs
          return! (match result with
                      | GrowthRateListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GrowthRateRetrieve
    /// <summary>
    /// Get growth rate
    /// </summary>

    let GrowthRateRetrieve (pathParams:GrowthRateRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GrowthRateRetrieveArgs
          let result = PokemonApiService.GrowthRateRetrieve ctx serviceArgs
          return! (match result with
                      | GrowthRateRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveDamageClassList
    /// <summary>
    /// List move damage classes
    /// </summary>

    let MoveDamageClassList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MoveDamageClassListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MoveDamageClassListArgs
          let result = PokemonApiService.MoveDamageClassList ctx serviceArgs
          return! (match result with
                      | MoveDamageClassListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MoveDamageClassRetrieve
    /// <summary>
    /// Get move damage class
    /// </summary>

    let MoveDamageClassRetrieve (pathParams:MoveDamageClassRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MoveDamageClassRetrieveArgs
          let result = PokemonApiService.MoveDamageClassRetrieve ctx serviceArgs
          return! (match result with
                      | MoveDamageClassRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region NatureList
    /// <summary>
    /// List natures
    /// </summary>

    let NatureList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<NatureListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : NatureListArgs
          let result = PokemonApiService.NatureList ctx serviceArgs
          return! (match result with
                      | NatureListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region NatureRetrieve
    /// <summary>
    /// Get nature
    /// </summary>

    let NatureRetrieve (pathParams:NatureRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : NatureRetrieveArgs
          let result = PokemonApiService.NatureRetrieve ctx serviceArgs
          return! (match result with
                      | NatureRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokeathlonStatList
    /// <summary>
    /// List pokeathlon stats
    /// </summary>

    let PokeathlonStatList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PokeathlonStatListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PokeathlonStatListArgs
          let result = PokemonApiService.PokeathlonStatList ctx serviceArgs
          return! (match result with
                      | PokeathlonStatListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokeathlonStatRetrieve
    /// <summary>
    /// Get pokeathlon stat
    /// </summary>

    let PokeathlonStatRetrieve (pathParams:PokeathlonStatRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PokeathlonStatRetrieveArgs
          let result = PokemonApiService.PokeathlonStatRetrieve ctx serviceArgs
          return! (match result with
                      | PokeathlonStatRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonColorList
    /// <summary>
    /// List pokemon colors
    /// </summary>

    let PokemonColorList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PokemonColorListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PokemonColorListArgs
          let result = PokemonApiService.PokemonColorList ctx serviceArgs
          return! (match result with
                      | PokemonColorListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonColorRetrieve
    /// <summary>
    /// Get pokemon color
    /// </summary>

    let PokemonColorRetrieve (pathParams:PokemonColorRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PokemonColorRetrieveArgs
          let result = PokemonApiService.PokemonColorRetrieve ctx serviceArgs
          return! (match result with
                      | PokemonColorRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonFormList
    /// <summary>
    /// List pokemon forms
    /// </summary>

    let PokemonFormList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PokemonFormListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PokemonFormListArgs
          let result = PokemonApiService.PokemonFormList ctx serviceArgs
          return! (match result with
                      | PokemonFormListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonFormRetrieve
    /// <summary>
    /// Get pokemon form
    /// </summary>

    let PokemonFormRetrieve (pathParams:PokemonFormRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PokemonFormRetrieveArgs
          let result = PokemonApiService.PokemonFormRetrieve ctx serviceArgs
          return! (match result with
                      | PokemonFormRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonHabitatList
    /// <summary>
    /// List pokemom habitas
    /// </summary>

    let PokemonHabitatList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PokemonHabitatListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PokemonHabitatListArgs
          let result = PokemonApiService.PokemonHabitatList ctx serviceArgs
          return! (match result with
                      | PokemonHabitatListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonHabitatRetrieve
    /// <summary>
    /// Get pokemom habita
    /// </summary>

    let PokemonHabitatRetrieve (pathParams:PokemonHabitatRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PokemonHabitatRetrieveArgs
          let result = PokemonApiService.PokemonHabitatRetrieve ctx serviceArgs
          return! (match result with
                      | PokemonHabitatRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonList
    /// <summary>
    /// List pokemon
    /// </summary>

    let PokemonList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PokemonListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PokemonListArgs
          let result = PokemonApiService.PokemonList ctx serviceArgs
          return! (match result with
                      | PokemonListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonRetrieve
    /// <summary>
    /// Get pokemon
    /// </summary>

    let PokemonRetrieve (pathParams:PokemonRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PokemonRetrieveArgs
          let result = PokemonApiService.PokemonRetrieve ctx serviceArgs
          return! (match result with
                      | PokemonRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonShapeList
    /// <summary>
    /// List pokemon shapes
    /// </summary>

    let PokemonShapeList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PokemonShapeListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PokemonShapeListArgs
          let result = PokemonApiService.PokemonShapeList ctx serviceArgs
          return! (match result with
                      | PokemonShapeListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonShapeRetrieve
    /// <summary>
    /// Get pokemon shape
    /// </summary>

    let PokemonShapeRetrieve (pathParams:PokemonShapeRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PokemonShapeRetrieveArgs
          let result = PokemonApiService.PokemonShapeRetrieve ctx serviceArgs
          return! (match result with
                      | PokemonShapeRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonSpeciesList
    /// <summary>
    /// List pokemon species
    /// </summary>

    let PokemonSpeciesList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PokemonSpeciesListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PokemonSpeciesListArgs
          let result = PokemonApiService.PokemonSpeciesList ctx serviceArgs
          return! (match result with
                      | PokemonSpeciesListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PokemonSpeciesRetrieve
    /// <summary>
    /// Get pokemon species
    /// </summary>

    let PokemonSpeciesRetrieve (pathParams:PokemonSpeciesRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PokemonSpeciesRetrieveArgs
          let result = PokemonApiService.PokemonSpeciesRetrieve ctx serviceArgs
          return! (match result with
                      | PokemonSpeciesRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region StatList
    /// <summary>
    /// List stats
    /// </summary>

    let StatList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<StatListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : StatListArgs
          let result = PokemonApiService.StatList ctx serviceArgs
          return! (match result with
                      | StatListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region StatRetrieve
    /// <summary>
    /// Get stat
    /// </summary>

    let StatRetrieve (pathParams:StatRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : StatRetrieveArgs
          let result = PokemonApiService.StatRetrieve ctx serviceArgs
          return! (match result with
                      | StatRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region TypeList
    /// <summary>
    /// List types
    /// </summary>

    let TypeList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<TypeListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : TypeListArgs
          let result = PokemonApiService.TypeList ctx serviceArgs
          return! (match result with
                      | TypeListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region TypeRetrieve
    /// <summary>
    /// Get types
    /// </summary>

    let TypeRetrieve (pathParams:TypeRetrievePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : TypeRetrieveArgs
          let result = PokemonApiService.TypeRetrieve ctx serviceArgs
          return! (match result with
                      | TypeRetrieveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

