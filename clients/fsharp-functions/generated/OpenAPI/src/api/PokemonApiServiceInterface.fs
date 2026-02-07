namespace OpenAPI
open PokemonApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module PokemonApiServiceInterface =

    //#region Service interface
    type IPokemonApiService =
      abstract member AbilityList : unit -> AbilityListResult
      abstract member AbilityRetrieve : unit -> AbilityRetrieveResult
      abstract member CharacteristicList : unit -> CharacteristicListResult
      abstract member CharacteristicRetrieve : unit -> CharacteristicRetrieveResult
      abstract member EggGroupList : unit -> EggGroupListResult
      abstract member EggGroupRetrieve : unit -> EggGroupRetrieveResult
      abstract member GenderList : unit -> GenderListResult
      abstract member GenderRetrieve : unit -> GenderRetrieveResult
      abstract member GrowthRateList : unit -> GrowthRateListResult
      abstract member GrowthRateRetrieve : unit -> GrowthRateRetrieveResult
      abstract member MoveDamageClassList : unit -> MoveDamageClassListResult
      abstract member MoveDamageClassRetrieve : unit -> MoveDamageClassRetrieveResult
      abstract member NatureList : unit -> NatureListResult
      abstract member NatureRetrieve : unit -> NatureRetrieveResult
      abstract member PokeathlonStatList : unit -> PokeathlonStatListResult
      abstract member PokeathlonStatRetrieve : unit -> PokeathlonStatRetrieveResult
      abstract member PokemonColorList : unit -> PokemonColorListResult
      abstract member PokemonColorRetrieve : unit -> PokemonColorRetrieveResult
      abstract member PokemonFormList : unit -> PokemonFormListResult
      abstract member PokemonFormRetrieve : unit -> PokemonFormRetrieveResult
      abstract member PokemonHabitatList : unit -> PokemonHabitatListResult
      abstract member PokemonHabitatRetrieve : unit -> PokemonHabitatRetrieveResult
      abstract member PokemonList : unit -> PokemonListResult
      abstract member PokemonRetrieve : unit -> PokemonRetrieveResult
      abstract member PokemonShapeList : unit -> PokemonShapeListResult
      abstract member PokemonShapeRetrieve : unit -> PokemonShapeRetrieveResult
      abstract member PokemonSpeciesList : unit -> PokemonSpeciesListResult
      abstract member PokemonSpeciesRetrieve : unit -> PokemonSpeciesRetrieveResult
      abstract member StatList : unit -> StatListResult
      abstract member StatRetrieve : unit -> StatRetrieveResult
      abstract member TypeList : unit -> TypeListResult
      abstract member TypeRetrieve : unit -> TypeRetrieveResult
    //#endregion