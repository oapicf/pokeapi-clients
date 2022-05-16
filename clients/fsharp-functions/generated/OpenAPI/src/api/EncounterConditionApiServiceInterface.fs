namespace OpenAPI
open EncounterConditionApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module EncounterConditionApiServiceInterface =

    //#region Service interface
    type IEncounterConditionApiService =
      abstract member EncounterConditionList : unit -> EncounterConditionListResult
      abstract member EncounterConditionRead : unit -> EncounterConditionReadResult
    //#endregion