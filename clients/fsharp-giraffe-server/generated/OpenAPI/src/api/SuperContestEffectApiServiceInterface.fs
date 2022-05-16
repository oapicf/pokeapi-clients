namespace OpenAPI
open SuperContestEffectApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module SuperContestEffectApiServiceInterface =

    //#region Service interface
    type ISuperContestEffectApiService =
      abstract member SuperContestEffectList:HttpContext -> SuperContestEffectListArgs->SuperContestEffectListResult
      abstract member SuperContestEffectRead:HttpContext -> SuperContestEffectReadArgs->SuperContestEffectReadResult
    //#endregion