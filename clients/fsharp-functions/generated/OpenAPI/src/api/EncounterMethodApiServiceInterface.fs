namespace OpenAPI
open EncounterMethodApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module EncounterMethodApiServiceInterface =

    //#region Service interface
    type IEncounterMethodApiService =
      abstract member EncounterMethodList : unit -> EncounterMethodListResult
      abstract member EncounterMethodRead : unit -> EncounterMethodReadResult
    //#endregion