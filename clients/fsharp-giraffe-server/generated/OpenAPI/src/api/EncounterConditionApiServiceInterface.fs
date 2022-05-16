namespace OpenAPI
open EncounterConditionApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module EncounterConditionApiServiceInterface =

    //#region Service interface
    type IEncounterConditionApiService =
      abstract member EncounterConditionList:HttpContext -> EncounterConditionListArgs->EncounterConditionListResult
      abstract member EncounterConditionRead:HttpContext -> EncounterConditionReadArgs->EncounterConditionReadResult
    //#endregion