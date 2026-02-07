namespace OpenAPI
open PokemonApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module PokemonApiServiceInterface =

    //#region Service interface
    type IPokemonApiService =
      abstract member AbilityList:HttpContext -> AbilityListArgs->AbilityListResult
      abstract member AbilityRetrieve:HttpContext -> AbilityRetrieveArgs->AbilityRetrieveResult
      abstract member CharacteristicList:HttpContext -> CharacteristicListArgs->CharacteristicListResult
      abstract member CharacteristicRetrieve:HttpContext -> CharacteristicRetrieveArgs->CharacteristicRetrieveResult
      abstract member EggGroupList:HttpContext -> EggGroupListArgs->EggGroupListResult
      abstract member EggGroupRetrieve:HttpContext -> EggGroupRetrieveArgs->EggGroupRetrieveResult
      abstract member GenderList:HttpContext -> GenderListArgs->GenderListResult
      abstract member GenderRetrieve:HttpContext -> GenderRetrieveArgs->GenderRetrieveResult
      abstract member GrowthRateList:HttpContext -> GrowthRateListArgs->GrowthRateListResult
      abstract member GrowthRateRetrieve:HttpContext -> GrowthRateRetrieveArgs->GrowthRateRetrieveResult
      abstract member MoveDamageClassList:HttpContext -> MoveDamageClassListArgs->MoveDamageClassListResult
      abstract member MoveDamageClassRetrieve:HttpContext -> MoveDamageClassRetrieveArgs->MoveDamageClassRetrieveResult
      abstract member NatureList:HttpContext -> NatureListArgs->NatureListResult
      abstract member NatureRetrieve:HttpContext -> NatureRetrieveArgs->NatureRetrieveResult
      abstract member PokeathlonStatList:HttpContext -> PokeathlonStatListArgs->PokeathlonStatListResult
      abstract member PokeathlonStatRetrieve:HttpContext -> PokeathlonStatRetrieveArgs->PokeathlonStatRetrieveResult
      abstract member PokemonColorList:HttpContext -> PokemonColorListArgs->PokemonColorListResult
      abstract member PokemonColorRetrieve:HttpContext -> PokemonColorRetrieveArgs->PokemonColorRetrieveResult
      abstract member PokemonFormList:HttpContext -> PokemonFormListArgs->PokemonFormListResult
      abstract member PokemonFormRetrieve:HttpContext -> PokemonFormRetrieveArgs->PokemonFormRetrieveResult
      abstract member PokemonHabitatList:HttpContext -> PokemonHabitatListArgs->PokemonHabitatListResult
      abstract member PokemonHabitatRetrieve:HttpContext -> PokemonHabitatRetrieveArgs->PokemonHabitatRetrieveResult
      abstract member PokemonList:HttpContext -> PokemonListArgs->PokemonListResult
      abstract member PokemonRetrieve:HttpContext -> PokemonRetrieveArgs->PokemonRetrieveResult
      abstract member PokemonShapeList:HttpContext -> PokemonShapeListArgs->PokemonShapeListResult
      abstract member PokemonShapeRetrieve:HttpContext -> PokemonShapeRetrieveArgs->PokemonShapeRetrieveResult
      abstract member PokemonSpeciesList:HttpContext -> PokemonSpeciesListArgs->PokemonSpeciesListResult
      abstract member PokemonSpeciesRetrieve:HttpContext -> PokemonSpeciesRetrieveArgs->PokemonSpeciesRetrieveResult
      abstract member StatList:HttpContext -> StatListArgs->StatListResult
      abstract member StatRetrieve:HttpContext -> StatRetrieveArgs->StatRetrieveResult
      abstract member TypeList:HttpContext -> TypeListArgs->TypeListResult
      abstract member TypeRetrieve:HttpContext -> TypeRetrieveArgs->TypeRetrieveResult
    //#endregion