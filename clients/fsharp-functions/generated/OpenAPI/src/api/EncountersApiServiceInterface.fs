namespace OpenAPI
open EncountersApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module EncountersApiServiceInterface =

    //#region Service interface
    type IEncountersApiService =
      abstract member EncounterConditionList : unit -> EncounterConditionListResult
      abstract member EncounterConditionRetrieve : unit -> EncounterConditionRetrieveResult
      abstract member EncounterConditionValueList : unit -> EncounterConditionValueListResult
      abstract member EncounterConditionValueRetrieve : unit -> EncounterConditionValueRetrieveResult
      abstract member EncounterMethodList : unit -> EncounterMethodListResult
      abstract member EncounterMethodRetrieve : unit -> EncounterMethodRetrieveResult
    //#endregion