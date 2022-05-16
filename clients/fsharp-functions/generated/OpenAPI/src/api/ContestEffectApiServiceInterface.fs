namespace OpenAPI
open ContestEffectApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ContestEffectApiServiceInterface =

    //#region Service interface
    type IContestEffectApiService =
      abstract member ContestEffectList : unit -> ContestEffectListResult
      abstract member ContestEffectRead : unit -> ContestEffectReadResult
    //#endregion