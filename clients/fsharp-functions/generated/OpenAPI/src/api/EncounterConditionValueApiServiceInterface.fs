namespace OpenAPI
open EncounterConditionValueApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module EncounterConditionValueApiServiceInterface =

    //#region Service interface
    type IEncounterConditionValueApiService =
      abstract member EncounterConditionValueList : unit -> EncounterConditionValueListResult
      abstract member EncounterConditionValueRead : unit -> EncounterConditionValueReadResult
    //#endregion