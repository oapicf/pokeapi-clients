namespace OpenAPI
open EncounterConditionValueApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module EncounterConditionValueApiServiceInterface =

    //#region Service interface
    type IEncounterConditionValueApiService =
      abstract member EncounterConditionValueList:HttpContext -> EncounterConditionValueListArgs->EncounterConditionValueListResult
      abstract member EncounterConditionValueRead:HttpContext -> EncounterConditionValueReadArgs->EncounterConditionValueReadResult
    //#endregion