namespace OpenAPI
open EncounterMethodApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module EncounterMethodApiServiceInterface =

    //#region Service interface
    type IEncounterMethodApiService =
      abstract member EncounterMethodList:HttpContext -> EncounterMethodListArgs->EncounterMethodListResult
      abstract member EncounterMethodRead:HttpContext -> EncounterMethodReadArgs->EncounterMethodReadResult
    //#endregion