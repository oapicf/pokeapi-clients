namespace OpenAPI
open EncountersApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module EncountersApiServiceInterface =

    //#region Service interface
    type IEncountersApiService =
      abstract member EncounterConditionList:HttpContext -> EncounterConditionListArgs->EncounterConditionListResult
      abstract member EncounterConditionRetrieve:HttpContext -> EncounterConditionRetrieveArgs->EncounterConditionRetrieveResult
      abstract member EncounterConditionValueList:HttpContext -> EncounterConditionValueListArgs->EncounterConditionValueListResult
      abstract member EncounterConditionValueRetrieve:HttpContext -> EncounterConditionValueRetrieveArgs->EncounterConditionValueRetrieveResult
      abstract member EncounterMethodList:HttpContext -> EncounterMethodListArgs->EncounterMethodListResult
      abstract member EncounterMethodRetrieve:HttpContext -> EncounterMethodRetrieveArgs->EncounterMethodRetrieveResult
      abstract member PokemonEncountersRetrieve:HttpContext -> PokemonEncountersRetrieveArgs->PokemonEncountersRetrieveResult
    //#endregion