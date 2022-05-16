namespace OpenAPI
open SuperContestEffectApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module SuperContestEffectApiServiceInterface =

    //#region Service interface
    type ISuperContestEffectApiService =
      abstract member SuperContestEffectList : unit -> SuperContestEffectListResult
      abstract member SuperContestEffectRead : unit -> SuperContestEffectReadResult
    //#endregion